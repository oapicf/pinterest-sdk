package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AdAccountOwner;
import org.openapitools.server.model.BusinessAccessRole;
import org.openapitools.server.model.Country;
import org.openapitools.server.model.Currency;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdAccount   {

    private Country country;
    private Integer createdTime;
    private Currency currency;
    private String id;
    private String name;
    private AdAccountOwner owner;
    private List<BusinessAccessRole> permissions = new ArrayList<>();
    private String timeZone;
    private Integer updatedTime;

    /**
     * Default constructor.
     */
    public AdAccount() {
    // JSON-B / Jackson
    }

    /**
     * Create AdAccount.
     *
     * @param country country
     * @param createdTime  Creation time. Unix timestamp in seconds.
     * @param currency currency
     * @param id id
     * @param name Ad account name.
     * @param owner Ad account owner
     * @param permissions permissions
     * @param timeZone The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
     * @param updatedTime updatedTime
     */
    public AdAccount(
        Country country, 
        Integer createdTime, 
        Currency currency, 
        String id, 
        String name, 
        AdAccountOwner owner, 
        List<BusinessAccessRole> permissions, 
        String timeZone, 
        Integer updatedTime
    ) {
        this.country = country;
        this.createdTime = createdTime;
        this.currency = currency;
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.permissions = permissions;
        this.timeZone = timeZone;
        this.updatedTime = updatedTime;
    }



    /**
     * Get country
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     *  Creation time. Unix timestamp in seconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Get currency
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Ad account name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ad account owner
     * @return owner
     */
    public AdAccountOwner getOwner() {
        return owner;
    }

    public void setOwner(AdAccountOwner owner) {
        this.owner = owner;
    }

    /**
     * Get permissions
     * @return permissions
     */
    public List<BusinessAccessRole> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<BusinessAccessRole> permissions) {
        this.permissions = permissions;
    }

    /**
     * The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Get updatedTime
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdAccount {\n");
        
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

