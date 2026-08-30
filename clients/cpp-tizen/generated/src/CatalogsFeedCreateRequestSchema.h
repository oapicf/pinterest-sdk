/*
 * CatalogsFeedCreateRequestSchema.h
 *
 * 
 */

#ifndef _CatalogsFeedCreateRequestSchema_H_
#define _CatalogsFeedCreateRequestSchema_H_


#include <string>
#include "CatalogsCreativeAssetsFeedsCreateRequest_default_locale.h"
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFeedsCreateRequest.h"
#include "CatalogsFormat.h"
#include "CatalogsStatus.h"
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

class CatalogsFeedCreateRequestSchema : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedCreateRequestSchema();
	CatalogsFeedCreateRequestSchema(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedCreateRequestSchema();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	CatalogsFeedCredentials getCredentials();

	/*! \brief Set 
	 */
	void setCredentials(CatalogsFeedCredentials  credentials);
	/*! \brief Get 
	 */
	ProductAvailabilityType getDefaultAvailability();

	/*! \brief Set 
	 */
	void setDefaultAvailability(ProductAvailabilityType  default_availability);
	/*! \brief Get 
	 */
	Country getDefaultCountry();

	/*! \brief Set 
	 */
	void setDefaultCountry(Country  default_country);
	/*! \brief Get 
	 */
	NullableCurrency getDefaultCurrency();

	/*! \brief Set 
	 */
	void setDefaultCurrency(NullableCurrency  default_currency);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsFeedsCreateRequest_default_locale getDefaultLocale();

	/*! \brief Set 
	 */
	void setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequest_default_locale  default_locale);
	/*! \brief Get 
	 */
	CatalogsFormat getFormat();

	/*! \brief Set 
	 */
	void setFormat(CatalogsFormat  format);
	/*! \brief Get The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	std::string getLocation();

	/*! \brief Set The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	void setLocation(std::string  location);
	/*! \brief Get A human-friendly name associated to a given feed.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given feed.
	 */
	void setName(std::string  name);
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

private:
	std::string catalog_id;
	std::string catalog_type;
	CatalogsFeedCredentials credentials;
	ProductAvailabilityType default_availability;
	Country default_country;
	NullableCurrency default_currency;
	CatalogsCreativeAssetsFeedsCreateRequest_default_locale default_locale;
	CatalogsFormat format;
	std::string location;
	std::string name;
	CatalogsFeedProcessingSchedule preferred_processing_schedule;
	CatalogsStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedCreateRequestSchema_H_ */
