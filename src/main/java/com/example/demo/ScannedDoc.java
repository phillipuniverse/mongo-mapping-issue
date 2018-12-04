/**
 * 
 */
package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Picked up by an {@link EntityScan}
 * 
 * @author Phillip Verheyden (phillipuniverse)
 */
@Document(collection = "docs")
public class ScannedDoc {

}
