package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AssetIdWithPermissions;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ad accounts and profiles the business member/partner has access to.
 */
public class BusinessMemberAssetsSummary   {

    private List<@Valid AssetIdWithPermissions> adAccounts = new ArrayList<>();
    private List<@Valid AssetIdWithPermissions> profiles = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BusinessMemberAssetsSummary() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessMemberAssetsSummary.
     *
     * @param adAccounts List of ad account IDs and respective permission levels.
     * @param profiles List of profile IDs and respective permission levels.
     */
    public BusinessMemberAssetsSummary(
        List<@Valid AssetIdWithPermissions> adAccounts, 
        List<@Valid AssetIdWithPermissions> profiles
    ) {
        this.adAccounts = adAccounts;
        this.profiles = profiles;
    }



    /**
     * List of ad account IDs and respective permission levels.
     * @return adAccounts
     */
    public List<@Valid AssetIdWithPermissions> getAdAccounts() {
        return adAccounts;
    }

    public void setAdAccounts(List<@Valid AssetIdWithPermissions> adAccounts) {
        this.adAccounts = adAccounts;
    }

    /**
     * List of profile IDs and respective permission levels.
     * @return profiles
     */
    public List<@Valid AssetIdWithPermissions> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<@Valid AssetIdWithPermissions> profiles) {
        this.profiles = profiles;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessMemberAssetsSummary {\n");
        
        sb.append("    adAccounts: ").append(toIndentedString(adAccounts)).append("\n");
        sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

