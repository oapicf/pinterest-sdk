package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.PinterestTagEventData;

@Canonical
class AudienceRule {
    /* Valid countries include: \"US\", \"CA\", and \"GB\". */
    String country
    /* Customer list ID. For CUSTOMER_LIST `audience_type`. */
    String customerListId
    /* The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. */
    List<String> engagementDomain = new ArrayList<>()
    /* Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  */
    String engagementType
    /* A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. */
    String event
    
    PinterestTagEventData eventData
    /* Percentage should be 1-10. The targeted audience should be this % size across Pinterest. */
    Integer percentage
    /* IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] */
    List<String> pinId = new ArrayList<>()
    /* Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. */
    Boolean prefill
    /* Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. */
    Integer retentionDays
    /* Audience ID(s). For ACTALIKE `audience_type`.  */
    List<String> seedId = new ArrayList<>()
    /* Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} */
    List<String> url = new ArrayList<>()
    /* The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. */
    String visitorSourceId
    /* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline */
    Object eventSource
    /* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api */
    Object ingestionSource
    /* Optional for ENGAGEMENT. Engager type value should be 1-2. */
    Integer engagerType
    /* Campaign ID for engagement audience filter. */
    List<String> campaignId = new ArrayList<>()
    /* Ad ID for engagement audience filter. */
    List<String> adId = new ArrayList<>()
    /* Objective for engagement audience filter. */
    List<ObjectiveType> objectiveType = new ArrayList<>()
    /* Ad account ID. */
    String adAccountId
}
