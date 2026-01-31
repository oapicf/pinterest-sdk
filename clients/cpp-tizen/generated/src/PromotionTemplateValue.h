/*
 * PromotionTemplateValue.h
 *
 * 
 */

#ifndef _PromotionTemplateValue_H_
#define _PromotionTemplateValue_H_


#include <string>
#include "Currency.h"
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

class PromotionTemplateValue : public Object {
public:
	/*! \brief Constructor.
	 */
	PromotionTemplateValue();
	PromotionTemplateValue(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromotionTemplateValue();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Numeric value.
	 */
	long long getAmount();

	/*! \brief Set Numeric value.
	 */
	void setAmount(long long  amount);
	/*! \brief Get 
	 */
	Currency getCurrencyCode();

	/*! \brief Set 
	 */
	void setCurrencyCode(Currency  currency_code);
	/*! \brief Get Custom text.
	 */
	std::string getCustomText();

	/*! \brief Set Custom text.
	 */
	void setCustomText(std::string  custom_text);
	/*! \brief Get Percent value.
	 */
	long long getPercent();

	/*! \brief Set Percent value.
	 */
	void setPercent(long long  percent);

private:
	long long amount;
	Currency currency_code;
	std::string custom_text;
	long long percent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromotionTemplateValue_H_ */
