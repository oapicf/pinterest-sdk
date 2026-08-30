
/*
 * CatalogsHotelFeedsCreateRequest.h
 *
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelFeedsCreateRequest_H_
#define TINY_CPP_CLIENT_CatalogsHotelFeedsCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsFeedsCreateRequest_default_locale.h"
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFormat.h"
#include "CatalogsStatus.h"
#include "NullableCurrency.h"

namespace Tiny {


/*! \brief Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelFeedsCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelFeedsCreateRequest();
    CatalogsHotelFeedsCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelFeedsCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	 */
	void setCatalogId(std::string catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	CatalogsFeedCredentials getCredentials();

	/*! \brief Set 
	 */
	void setCredentials(CatalogsFeedCredentials credentials);
	/*! \brief Get 
	 */
	NullableCurrency getDefaultCurrency();

	/*! \brief Set 
	 */
	void setDefaultCurrency(NullableCurrency default_currency);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsFeedsCreateRequest_default_locale getDefaultLocale();

	/*! \brief Set 
	 */
	void setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequest_default_locale default_locale);
	/*! \brief Get 
	 */
	CatalogsFormat getFormat();

	/*! \brief Set 
	 */
	void setFormat(CatalogsFormat format);
	/*! \brief Get The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	std::string getLocation();

	/*! \brief Set The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	 */
	void setLocation(std::string location);
	/*! \brief Get A human-friendly name associated to a given feed.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given feed.
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	CatalogsFeedProcessingSchedule getPreferredProcessingSchedule();

	/*! \brief Set 
	 */
	void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferred_processing_schedule);
	/*! \brief Get 
	 */
	CatalogsStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsStatus status);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    CatalogsFeedCredentials credentials;
    NullableCurrency default_currency;
    CatalogsCreativeAssetsFeedsCreateRequest_default_locale default_locale;
    CatalogsFormat format;
    std::string location{};
    std::string name{};
    CatalogsFeedProcessingSchedule preferred_processing_schedule;
    CatalogsStatus status;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelFeedsCreateRequest_H_ */
