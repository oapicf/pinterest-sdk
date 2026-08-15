
/*
 * CatalogsRetailFeed.h
 *
 * Catalogs Retail Feed object
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailFeed_H_
#define TINY_CPP_CLIENT_CatalogsRetailFeed_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedCredentials.h"
#include "CatalogsFeedProcessingSchedule.h"
#include "CatalogsFormat.h"
#include "CatalogsStatus.h"
#include "CatalogsType.h"
#include "Country.h"
#include "NullableCurrency.h"
#include "ProductAvailabilityType.h"

namespace Tiny {


/*! \brief Catalogs Retail Feed object
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailFeed{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailFeed();
    CatalogsRetailFeed(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailFeed();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get The locale used within a feed for product descriptions.
	 */
	std::string getDefaultLocale();

	/*! \brief Set The locale used within a feed for product descriptions.
	 */
	void setDefaultLocale(std::string  default_locale);
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
	/*! \brief Get A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
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
    std::string created_at{};
    std::string id{};
    std::string updated_at{};
    CatalogsType catalog_type;
    CatalogsFeedCredentials credentials;
    ProductAvailabilityType default_availability;
    Country default_country;
    NullableCurrency default_currency;
    std::string default_locale{};
    CatalogsFormat format;
    std::string location{};
    std::string name{};
    CatalogsFeedProcessingSchedule preferred_processing_schedule;
    CatalogsStatus status;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailFeed_H_ */
