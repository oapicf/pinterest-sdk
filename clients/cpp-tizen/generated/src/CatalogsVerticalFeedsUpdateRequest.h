/*
 * CatalogsVerticalFeedsUpdateRequest.h
 *
 * Request object for updating a feed.
 */

#ifndef _CatalogsVerticalFeedsUpdateRequest_H_
#define _CatalogsVerticalFeedsUpdateRequest_H_


#include <string>
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFormat.h"
#include "CatalogsHotelFeedsUpdateRequest.h"
#include "CatalogsRetailFeedsUpdateRequest.h"
#include "CatalogsStatus.h"
#include "CatalogsType.h"
#include "NullableCurrency.h"
#include "ProductAvailabilityType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for updating a feed.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalFeedsUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalFeedsUpdateRequest();
	CatalogsVerticalFeedsUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalFeedsUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	NullableCurrency getDefaultCurrency();

	/*! \brief Set 
	 */
	void setDefaultCurrency(NullableCurrency  default_currency);
	/*! \brief Get A human-friendly name associated to a given feed.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given feed.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	CatalogsFormat getFormat();

	/*! \brief Set 
	 */
	void setFormat(CatalogsFormat  format);
	/*! \brief Get 
	 */
	CatalogsFeedCredentials getCredentials();

	/*! \brief Set 
	 */
	void setCredentials(CatalogsFeedCredentials  credentials);
	/*! \brief Get The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	std::string getLocation();

	/*! \brief Set The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	void setLocation(std::string  location);
	/*! \brief Get 
	 */
	CatalogsFeedProcessingSchedule getPreferredProcessingSchedule();

	/*! \brief Set 
	 */
	void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule  preferred_processing_schedule);
	/*! \brief Get 
	 */
	CatalogsStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsStatus  status);
	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get 
	 */
	ProductAvailabilityType getDefaultAvailability();

	/*! \brief Set 
	 */
	void setDefaultAvailability(ProductAvailabilityType  default_availability);

private:
	NullableCurrency default_currency;
	std::string name;
	CatalogsFormat format;
	CatalogsFeedCredentials credentials;
	std::string location;
	CatalogsFeedProcessingSchedule preferred_processing_schedule;
	CatalogsStatus status;
	CatalogsType catalog_type;
	ProductAvailabilityType default_availability;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalFeedsUpdateRequest_H_ */
