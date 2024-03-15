/*
 * CatalogsHotelFeedsCreateRequest.h
 *
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */

#ifndef _CatalogsHotelFeedsCreateRequest_H_
#define _CatalogsHotelFeedsCreateRequest_H_


#include <string>
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFeedsCreateRequest_default_locale.h"
#include "CatalogsFormat.h"
#include "CatalogsType.h"
#include "NullableCurrency.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelFeedsCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelFeedsCreateRequest();
	CatalogsHotelFeedsCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelFeedsCreateRequest();

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
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelFeedsCreateRequest_H_ */
