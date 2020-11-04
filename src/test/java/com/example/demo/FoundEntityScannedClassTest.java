package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mapping.model.BasicPersistentEntity;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@SpringBootTest
public class FoundEntityScannedClassTest {

    @Autowired
    MongoMappingContext mappingContext;

    @Test
    public void validateExtendedComponentsMapped() {
        assertThat(mappingContext.getPersistentEntities().stream().map(BasicPersistentEntity::getType))
                .anyMatch(t -> t.equals(ScannedDoc.class));
    }

}
