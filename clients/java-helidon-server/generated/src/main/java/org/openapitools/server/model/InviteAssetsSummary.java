package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.InviteAssetsSummaryItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
public class InviteAssetsSummary   {

    private List<@Valid InviteAssetsSummaryItem> adAccounts = new ArrayList<>();
    private List<@Valid InviteAssetsSummaryItem> profiles = new ArrayList<>();

    /**
     * Default constructor.
     */
    public InviteAssetsSummary() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteAssetsSummary.
     *
     * @param adAccounts List of ad account IDs and respective permission levels that will be assigned.
     * @param profiles List of profile IDs and respective permission levels that will be assigned.
     */
    public InviteAssetsSummary(
        List<@Valid InviteAssetsSummaryItem> adAccounts, 
        List<@Valid InviteAssetsSummaryItem> profiles
    ) {
        this.adAccounts = adAccounts;
        this.profiles = profiles;
    }



    /**
     * List of ad account IDs and respective permission levels that will be assigned.
     * @return adAccounts
     */
    public List<@Valid InviteAssetsSummaryItem> getAdAccounts() {
        return adAccounts;
    }

    public void setAdAccounts(List<@Valid InviteAssetsSummaryItem> adAccounts) {
        this.adAccounts = adAccounts;
    }

    /**
     * List of profile IDs and respective permission levels that will be assigned.
     * @return profiles
     */
    public List<@Valid InviteAssetsSummaryItem> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<@Valid InviteAssetsSummaryItem> profiles) {
        this.profiles = profiles;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteAssetsSummary {\n");
        
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

