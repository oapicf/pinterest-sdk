/*
 * CatalogsHotelFeed.h
 *
 * Catalogs Hotel Feed object
 */

#ifndef _CatalogsHotelFeed_H_
#define _CatalogsHotelFeed_H_


#include <string>
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFormat.h"
#include "CatalogsStatus.h"
#include "CatalogsType.h"
#include "NullableCurrency.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Catalogs Hotel Feed object
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelFeed : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelFeed();
	CatalogsHotelFeed(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelFeed();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(std::string  updated_at);
	/*! \brief Get A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
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
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
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
	NullableCurrency getDefaultCurrency();

	/*! \brief Set 
	 */
	void setDefaultCurrency(NullableCurrency  default_currency);
	/*! \brief Get The locale used within a feed for product descriptions.
	 */
	std::string getDefaultLocale();

	/*! \brief Set The locale used within a feed for product descriptions.
	 */
	void setDefaultLocale(std::string  default_locale);
	/*! \brief Get Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string created_at;
	std::string id;
	std::string updated_at;
	std::string name;
	CatalogsFormat format;
	CatalogsType catalog_type;
	CatalogsFeedCredentials credentials;
	std::string location;
	CatalogsFeedProcessingSchedule preferred_processing_schedule;
	CatalogsStatus status;
	NullableCurrency default_currency;
	std::string default_locale;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelFeed_H_ */
