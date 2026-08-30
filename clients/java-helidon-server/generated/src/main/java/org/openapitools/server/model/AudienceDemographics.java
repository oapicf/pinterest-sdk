package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AudienceDemographicValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Audience demographics
 */
public class AudienceDemographics   {

    private List<@Valid AudienceDemographicValue> ages = new ArrayList<>();
    private List<@Valid AudienceDemographicValue> countries = new ArrayList<>();
    private List<@Valid AudienceDemographicValue> devices = new ArrayList<>();
    private List<@Valid AudienceDemographicValue> genders = new ArrayList<>();
    private List<@Valid AudienceDemographicValue> metros = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AudienceDemographics() {
    // JSON-B / Jackson
    }

    /**
     * Create AudienceDemographics.
     *
     * @param ages Ages distribution.
     * @param countries Country area distribution.
     * @param devices Device usage distribution.
     * @param genders Gender distribution.
     * @param metros Geographic metro area distribution.
     */
    public AudienceDemographics(
        List<@Valid AudienceDemographicValue> ages, 
        List<@Valid AudienceDemographicValue> countries, 
        List<@Valid AudienceDemographicValue> devices, 
        List<@Valid AudienceDemographicValue> genders, 
        List<@Valid AudienceDemographicValue> metros
    ) {
        this.ages = ages;
        this.countries = countries;
        this.devices = devices;
        this.genders = genders;
        this.metros = metros;
    }



    /**
     * Ages distribution.
     * @return ages
     */
    public List<@Valid AudienceDemographicValue> getAges() {
        return ages;
    }

    public void setAges(List<@Valid AudienceDemographicValue> ages) {
        this.ages = ages;
    }

    /**
     * Country area distribution.
     * @return countries
     */
    public List<@Valid AudienceDemographicValue> getCountries() {
        return countries;
    }

    public void setCountries(List<@Valid AudienceDemographicValue> countries) {
        this.countries = countries;
    }

    /**
     * Device usage distribution.
     * @return devices
     */
    public List<@Valid AudienceDemographicValue> getDevices() {
        return devices;
    }

    public void setDevices(List<@Valid AudienceDemographicValue> devices) {
        this.devices = devices;
    }

    /**
     * Gender distribution.
     * @return genders
     */
    public List<@Valid AudienceDemographicValue> getGenders() {
        return genders;
    }

    public void setGenders(List<@Valid AudienceDemographicValue> genders) {
        this.genders = genders;
    }

    /**
     * Geographic metro area distribution.
     * @return metros
     */
    public List<@Valid AudienceDemographicValue> getMetros() {
        return metros;
    }

    public void setMetros(List<@Valid AudienceDemographicValue> metros) {
        this.metros = metros;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudienceDemographics {\n");
        
        sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
        sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
        sb.append("    genders: ").append(toIndentedString(genders)).append("\n");
        sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

