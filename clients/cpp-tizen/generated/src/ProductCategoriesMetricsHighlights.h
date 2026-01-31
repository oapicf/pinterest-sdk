/*
 * ProductCategoriesMetricsHighlights.h
 *
 * Key performance metrics highlights for this product category
 */

#ifndef _ProductCategoriesMetricsHighlights_H_
#define _ProductCategoriesMetricsHighlights_H_


#include <string>
#include "InnerProductCategoriesMetricsHighlights.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Key performance metrics highlights for this product category
 *
 *  \ingroup Models
 *
 */

class ProductCategoriesMetricsHighlights : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductCategoriesMetricsHighlights();
	ProductCategoriesMetricsHighlights(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductCategoriesMetricsHighlights();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductCategoriesMetricsHighlights_H_ */
