/*
 * AudienceRule.h
 *
 * JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
 */

#ifndef _AudienceRule_H_
#define _AudienceRule_H_


#include <string>
#include "ObjectiveType.h"
#include "PinterestTagEventData.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief JSON object defining targeted audience users. Example rule formats per audience type:<br>CUSTOMER_LIST: { \"customer_list_id\": \"&lt;customer list ID&gt;\"}<br>ACTALIKE: { \"seed_id\": [\"&lt;audience ID&gt;\"], \"country\": \"US\", \"percentage\": \"10\" }<br>(Valid countries include: \"US\", \"CA\", and \"GB\". Percentage should be 1-10.<br>The targeted audience should be this % size across Pinterest.)<br>VISITOR: { \"visitor_source_id\": [\"&lt;conversion tag ID&gt;\"], \"retention_days\": \"180\", \"event_source\": {\"=\": [\"web\", \"mobile\"]}, \"ingestion_source\": {\"=\": [\"tag\"]}}<br>(Retention days should be 1-540. Retention applies to specific customers.)<br>ENGAGEMENT: {\"engagement_domain\": [\"www.entomi.com\"], \"engager_type\": 1}<br>For more details on engagement audiences, see <a href=\"/docs/redoc/adtech_ads_v4/#section/November-2021\" target=\"_blank\">November 2021 changelog</a>.
 *
 *  \ingroup Models
 *
 */

class AudienceRule : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceRule();
	AudienceRule(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceRule();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Valid countries include: \"US\", \"CA\", and \"GB\".
	 */
	std::string getCountry();

	/*! \brief Set Valid countries include: \"US\", \"CA\", and \"GB\".
	 */
	void setCountry(std::string  country);
	/*! \brief Get Customer list ID. For CUSTOMER_LIST `audience_type`.
	 */
	std::string getCustomerListId();

	/*! \brief Set Customer list ID. For CUSTOMER_LIST `audience_type`.
	 */
	void setCustomerListId(std::string  customer_list_id);
	/*! \brief Get The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
	 */
	std::list<std::string> getEngagementDomain();

	/*! \brief Set The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
	 */
	void setEngagementDomain(std::list <std::string> engagement_domain);
	/*! \brief Get Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
	 */
	std::string getEngagementType();

	/*! \brief Set Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
	 */
	void setEngagementType(std::string  engagement_type);
	/*! \brief Get A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
	 */
	std::string getEvent();

	/*! \brief Set A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	PinterestTagEventData getEventData();

	/*! \brief Set 
	 */
	void setEventData(PinterestTagEventData  event_data);
	/*! \brief Get Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
	 */
	int getPercentage();

	/*! \brief Set Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
	 */
	void setPercentage(int  percentage);
	/*! \brief Get IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
	 */
	std::list<std::string> getPinId();

	/*! \brief Set IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
	 */
	void setPinId(std::list <std::string> pin_id);
	/*! \brief Get Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
	 */
	bool getPrefill();

	/*! \brief Set Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
	 */
	void setPrefill(bool  prefill);
	/*! \brief Get Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
	 */
	int getRetentionDays();

	/*! \brief Set Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
	 */
	void setRetentionDays(int  retention_days);
	/*! \brief Get Audience ID(s). For ACTALIKE `audience_type`. 
	 */
	std::list<std::string> getSeedId();

	/*! \brief Set Audience ID(s). For ACTALIKE `audience_type`. 
	 */
	void setSeedId(std::list <std::string> seed_id);
	/*! \brief Get Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
	 */
	std::list<std::string> getUrl();

	/*! \brief Set Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
	 */
	void setUrl(std::list <std::string> url);
	/*! \brief Get The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
	 */
	std::string getVisitorSourceId();

	/*! \brief Set The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
	 */
	void setVisitorSourceId(std::string  visitor_source_id);
	/*! \brief Get Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
	 */
	std::string getEventSource();

	/*! \brief Set Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
	 */
	void setEventSource(std::string  event_source);
	/*! \brief Get Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
	 */
	std::string getIngestionSource();

	/*! \brief Set Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
	 */
	void setIngestionSource(std::string  ingestion_source);
	/*! \brief Get Optional for ENGAGEMENT. Engager type value should be 1-2.
	 */
	int getEngagerType();

	/*! \brief Set Optional for ENGAGEMENT. Engager type value should be 1-2.
	 */
	void setEngagerType(int  engager_type);
	/*! \brief Get Campaign ID for engagement audience filter.
	 */
	std::list<std::string> getCampaignId();

	/*! \brief Set Campaign ID for engagement audience filter.
	 */
	void setCampaignId(std::list <std::string> campaign_id);
	/*! \brief Get Ad ID for engagement audience filter.
	 */
	std::list<std::string> getAdId();

	/*! \brief Set Ad ID for engagement audience filter.
	 */
	void setAdId(std::list <std::string> ad_id);
	/*! \brief Get Objective for engagement audience filter.
	 */
	std::list<ObjectiveType> getObjectiveType();

	/*! \brief Set Objective for engagement audience filter.
	 */
	void setObjectiveType(std::list <ObjectiveType> objective_type);
	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string  ad_account_id);

private:
	std::string country;
	std::string customer_list_id;
	std::list <std::string>engagement_domain;
	std::string engagement_type;
	std::string event;
	PinterestTagEventData event_data;
	int percentage;
	std::list <std::string>pin_id;
	bool prefill;
	int retention_days;
	std::list <std::string>seed_id;
	std::list <std::string>url;
	std::string visitor_source_id;
	std::string event_source;
	std::string ingestion_source;
	int engager_type;
	std::list <std::string>campaign_id;
	std::list <std::string>ad_id;
	std::list <ObjectiveType>objective_type;
	std::string ad_account_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceRule_H_ */
