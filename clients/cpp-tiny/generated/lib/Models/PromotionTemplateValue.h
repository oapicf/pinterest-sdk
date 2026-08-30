
/*
 * PromotionTemplateValue.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PromotionTemplateValue_H_
#define TINY_CPP_CLIENT_PromotionTemplateValue_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Currency.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PromotionTemplateValue{
public:

    /*! \brief Constructor.
	 */
    PromotionTemplateValue();
    PromotionTemplateValue(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromotionTemplateValue();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Numeric value.
	 */
	long getAmount();

	/*! \brief Set Numeric value.
	 */
	void setAmount(long amount);
	/*! \brief Get 
	 */
	Currency getCurrencyCode();

	/*! \brief Set 
	 */
	void setCurrencyCode(Currency currency_code);
	/*! \brief Get Custom text.
	 */
	std::string getCustomText();

	/*! \brief Set Custom text.
	 */
	void setCustomText(std::string custom_text);
	/*! \brief Get Percent value.
	 */
	long getPercent();

	/*! \brief Set Percent value.
	 */
	void setPercent(long percent);


    private:
    long amount{};
    Currency currency_code;
    std::string custom_text{};
    long percent{};
};
}

#endif /* TINY_CPP_CLIENT_PromotionTemplateValue_H_ */
