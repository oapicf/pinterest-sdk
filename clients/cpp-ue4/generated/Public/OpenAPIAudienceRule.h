/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIObjectiveType.h"
#include "OpenAPIPinterestTagEventData.h"

namespace OpenAPI
{

/*
 * OpenAPIAudienceRule
 *
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */
class OPENAPI_API OpenAPIAudienceRule : public Model
{
public:
    virtual ~OpenAPIAudienceRule() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Valid countries include: \"US\", \"CA\", and \"GB\". */
	TOptional<FString> Country;
	/* Customer list ID. For CUSTOMER_LIST `audience_type`. */
	TOptional<FString> CustomerListId;
	/* The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. */
	TOptional<TArray<FString>> EngagementDomain;
	/* Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  */
	TOptional<FString> EngagementType;
	/* A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. */
	TOptional<FString> Event;
	TOptional<OpenAPIPinterestTagEventData> EventData;
	/* Percentage should be 1-10. The targeted audience should be this % size across Pinterest. */
	TOptional<int32> Percentage;
	/* IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] */
	TOptional<TArray<FString>> PinId;
	/* Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. */
	TOptional<bool> Prefill;
	/* Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. */
	TOptional<int32> RetentionDays;
	/* Audience ID(s). For ACTALIKE `audience_type`.  */
	TOptional<TArray<FString>> SeedId;
	/* Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} */
	TOptional<TArray<FString>> Url;
	/* The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. */
	TOptional<FString> VisitorSourceId;
	/* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline */
	TOptional<TSharedPtr<FJsonObject>> EventSource;
	/* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api */
	TOptional<TSharedPtr<FJsonObject>> IngestionSource;
	/* Optional for ENGAGEMENT. Engager type value should be 1-2. */
	TOptional<int32> EngagerType;
	/* Campaign ID for engagement audience filter. */
	TOptional<TArray<FString>> CampaignId;
	/* Ad ID for engagement audience filter. */
	TOptional<TArray<FString>> AdId;
	/* Objective for engagement audience filter. */
	TOptional<TArray<OpenAPIObjectiveType>> ObjectiveType;
	/* Ad account ID. */
	TOptional<FString> AdAccountId;
};

}
