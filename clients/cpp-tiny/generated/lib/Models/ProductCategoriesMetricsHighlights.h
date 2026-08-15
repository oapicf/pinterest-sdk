
/*
 * ProductCategoriesMetricsHighlights.h
 *
 * Key performance metrics highlights for this product category
 */

#ifndef TINY_CPP_CLIENT_ProductCategoriesMetricsHighlights_H_
#define TINY_CPP_CLIENT_ProductCategoriesMetricsHighlights_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InnerProductCategoriesMetricsHighlights.h"

namespace Tiny {


/*! \brief Key performance metrics highlights for this product category
 *
 *  \ingroup Models
 *
 */

class ProductCategoriesMetricsHighlights{
public:

    /*! \brief Constructor.
	 */
    ProductCategoriesMetricsHighlights();
    ProductCategoriesMetricsHighlights(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductCategoriesMetricsHighlights();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Engagement metric value
	 */
	InnerProductCategoriesMetricsHighlights getEngagement();

	/*! \brief Set Engagement metric value
	 */
	void setEngagement(InnerProductCategoriesMetricsHighlights  engagement);
	/*! \brief Get Number of outbound clicks
	 */
	InnerProductCategoriesMetricsHighlights getOutboundClicks();

	/*! \brief Set Number of outbound clicks
	 */
	void setOutboundClicks(InnerProductCategoriesMetricsHighlights  outbound_clicks);
	/*! \brief Get Number of pin saves
	 */
	InnerProductCategoriesMetricsHighlights getPinSaves();

	/*! \brief Set Number of pin saves
	 */
	void setPinSaves(InnerProductCategoriesMetricsHighlights  pin_saves);


    private:
    InnerProductCategoriesMetricsHighlights engagement;
    InnerProductCategoriesMetricsHighlights outbound_clicks;
    InnerProductCategoriesMetricsHighlights pin_saves;
};
}

#endif /* TINY_CPP_CLIENT_ProductCategoriesMetricsHighlights_H_ */
