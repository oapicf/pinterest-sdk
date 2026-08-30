
/*
 * DeliveryMetricsResponseItemsItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeliveryMetricsResponseItemsItems_H_
#define TINY_CPP_CLIENT_DeliveryMetricsResponseItemsItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeliveryMetricsResponseItemsItems{
public:

    /*! \brief Constructor.
	 */
    DeliveryMetricsResponseItemsItems();
    DeliveryMetricsResponseItemsItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeliveryMetricsResponseItemsItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Category name
	 */
	std::string getCategory();

	/*! \brief Set Category name
	 */
	void setCategory(std::string category);
	/*! \brief Get How the metric is defined.
	 */
	std::string getDefinition();

	/*! \brief Set How the metric is defined.
	 */
	void setDefinition(std::string definition);
	/*! \brief Get Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
	 */
	std::string getDisplayName();

	/*! \brief Set Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
	 */
	void setDisplayName(std::string display_name);
	/*! \brief Get Metric's name.
	 */
	std::string getName();

	/*! \brief Set Metric's name.
	 */
	void setName(std::string name);


    private:
    std::string category{};
    std::string definition{};
    std::string display_name{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_DeliveryMetricsResponseItemsItems_H_ */
