/*
 * Feeds_create_request.h
 *
 * 
 */

#ifndef _Feeds_create_request_H_
#define _Feeds_create_request_H_


#include <string>
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFeedsCreateRequest.h"
#include "CatalogsFeedsCreateRequest_default_locale.h"
#include "CatalogsFormat.h"
#include "CatalogsType.h"
#include "CatalogsVerticalFeedsCreateRequest.h"
#include "Country.h"
#include "NullableCurrency.h"
#include "ProductAvailabilityType.h"
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

class Feeds_create_request : public Object {
public:
	/*! \brief Constructor.
	 */
	Feeds_create_request();
	Feeds_create_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Feeds_create_request();

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
	CatalogsFeedsCreateRequest_default_locale getDefaultLocale();

	/*! \brief Set 
	 */
	void setDefaultLocale(CatalogsFeedsCreateRequest_default_locale  default_locale);
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
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get 
	 */
	Country getDefaultCountry();

	/*! \brief Set 
	 */
	void setDefaultCountry(Country  default_country);
	/*! \brief Get 
	 */
	ProductAvailabilityType getDefaultAvailability();

	/*! \brief Set 
	 */
	void setDefaultAvailability(ProductAvailabilityType  default_availability);
	/*! \brief Get Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
	 */
	void setCatalogId(std::string  catalog_id);

private:
	NullableCurrency default_currency;
	std::string name;
	CatalogsFormat format;
	CatalogsFeedsCreateRequest_default_locale default_locale;
	CatalogsFeedCredentials credentials;
	std::string location;
	CatalogsFeedProcessingSchedule preferred_processing_schedule;
	CatalogsType catalog_type;
	Country default_country;
	ProductAvailabilityType default_availability;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Feeds_create_request_H_ */
