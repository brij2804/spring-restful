package com.brijesh.restful.filter;

import com.brijesh.restful.beans.SampleBean;
import com.brijesh.restful.beans.SampleBeanThree;
import com.brijesh.restful.beans.SampleBeanTwo;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SampleBean retrieveSampleBean(){
        return new SampleBean("value1","value2","value3");
    }

    @GetMapping("/filtering-list")
    public List<SampleBean> retrieveListOfSampleBean(){
        return Arrays.asList(new SampleBean("value1","value2","value3"),
                new SampleBean("value12","value22","value32"));
    }

    @GetMapping("/filtering2")
    public SampleBeanTwo retrieveSampleBean2(){
        return new SampleBeanTwo("value1","value2","value3");
    }

    @GetMapping("/filtering2-list")
    public List<SampleBeanTwo> retrieveListOfSampleBean2(){
        return Arrays.asList(new SampleBeanTwo("value1","value2","value3"),
                new SampleBeanTwo("value12","value22","value32"));
    }

    @GetMapping("/filtering-dynamic")
    public MappingJacksonValue dynamicFiltering(){
        SampleBeanThree sampleBeanThree=new SampleBeanThree("value1","value2","value3");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
        FilterProvider filters= new SimpleFilterProvider().addFilter("SimpleFilter",filter);

        MappingJacksonValue mapping= new MappingJacksonValue(sampleBeanThree);
        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/filtering-dynamic-list")
    public MappingJacksonValue dynamicFilteringList(){
         List list= Arrays.asList(new SampleBeanThree("value1","value2","value3"),
                new SampleBeanThree("value12","value22","value32"));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
        FilterProvider filters= new SimpleFilterProvider().addFilter("SimpleFilter",filter);

        MappingJacksonValue mapping= new MappingJacksonValue(list);
        mapping.setFilters(filters);

        return mapping;
    }

}
