/*
 * PromotionUpdateRequest.h
 *
 * 
 */

#ifndef _PromotionUpdateRequest_H_
#define _PromotionUpdateRequest_H_


#include <string>
#include "EntityStatus.h"
#include "PromotionTemplateValue.h"
#include "PromotionType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PromotionUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	PromotionUpdateRequest();
	PromotionUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromotionUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Discount status based on the current time and start and end time of discount
	 */
	std::string getDiscountStatus();

	/*! \brief Set Discount status based on the current time and start and end time of discount
	 */
	void setDiscountStatus(std::string  discount_status);
	/*! \brief Get Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
	 */
	int getEndTime();

	/*! \brief Set Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
	 */
	void setEndTime(int  end_time);
	/*! \brief Get Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
	 */
	std::string getExternalId();

	/*! \brief Set Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
	 */
	void setExternalId(std::string  external_id);
	/*! \brief Get The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
	 */
	std::string getPlatformType();

	/*! \brief Set The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
	 */
	void setPlatformType(std::string  platform_type);
	/*! \brief Get Code that can be used to redeem a promotion.
	 */
	std::string getPromotionCode();

	/*! \brief Set Code that can be used to redeem a promotion.
	 */
	void setPromotionCode(std::string  promotion_code);
	/*! \brief Get An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
	 */
	std::string getPromotionCustomId();

	/*! \brief Set An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
	 */
	void setPromotionCustomId(std::string  promotion_custom_id);
	/*! \brief Get Internal name for the promotion.
	 */
	std::string getPromotionTitle();

	/*! \brief Set Internal name for the promotion.
	 */
	void setPromotionTitle(std::string  promotion_title);
	/*! \brief Get 
	 */
	PromotionType getPromotionType();

	/*! \brief Set 
	 */
	void setPromotionType(PromotionType  promotion_type);
	/*! \brief Get Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
	 */
	int getStartTime();

	/*! \brief Set Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
	 */
	void setStartTime(int  start_time);
	/*! \brief Get List of values to be inserted in the promotion type-specific template.
	 */
	std::list<PromotionTemplateValue> getTemplateValues();

	/*! \brief Set List of values to be inserted in the promotion type-specific template.
	 */
	void setTemplateValues(std::list <PromotionTemplateValue> template_values);
	/*! \brief Get Promotion ID
	 */
	std::string getId();

	/*! \brief Set Promotion ID
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);

private:
	std::string discount_status;
	int end_time;
	std::string external_id;
	std::string platform_type;
	std::string promotion_code;
	std::string promotion_custom_id;
	std::string promotion_title;
	PromotionType promotion_type;
	int start_time;
	std::list <PromotionTemplateValue>template_values;
	std::string id;
	EntityStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromotionUpdateRequest_H_ */
