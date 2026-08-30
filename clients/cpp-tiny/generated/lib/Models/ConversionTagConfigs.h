
/*
 * ConversionTagConfigs.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionTagConfigs_H_
#define TINY_CPP_CLIENT_ConversionTagConfigs_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionTagConfigs{
public:

    /*! \brief Constructor.
	 */
    ConversionTagConfigs();
    ConversionTagConfigs(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionTagConfigs();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool isAemDbEnabled();

	/*! \brief Set Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemDbEnabled(bool aem_db_enabled);
	/*! \brief Get Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool isAemEnabled();

	/*! \brief Set Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemEnabled(bool aem_enabled);
	/*! \brief Get Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool isAemExternalIdEnabled();

	/*! \brief Set Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemExternalIdEnabled(bool aem_external_id_enabled);
	/*! \brief Get Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool isAemFnlnEnabled();

	/*! \brief Set Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemFnlnEnabled(bool aem_fnln_enabled);
	/*! \brief Get Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool isAemGeEnabled();

	/*! \brief Set Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemGeEnabled(bool aem_ge_enabled);
	/*! \brief Get Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool isAemLocEnabled();

	/*! \brief Set Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemLocEnabled(bool aem_loc_enabled);
	/*! \brief Get Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool isAemPhEnabled();

	/*! \brief Set Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemPhEnabled(bool aem_ph_enabled);
	/*! \brief Get Metadata ingestion frequency.
	 */
	long getMdFrequency();

	/*! \brief Set Metadata ingestion frequency.
	 */
	void setMdFrequency(long md_frequency);
	/*! \brief Get List of advertiser subdomains configured for NoCodeCAPI calls.
	 */
	std::list<std::string> getNoCodeCapiDomains();

	/*! \brief Set List of advertiser subdomains configured for NoCodeCAPI calls.
	 */
	void setNoCodeCapiDomains(std::list<std::string> no_code_capi_domains);


    private:
    bool aem_db_enabled{};
    bool aem_enabled{};
    bool aem_external_id_enabled{};
    bool aem_fnln_enabled{};
    bool aem_ge_enabled{};
    bool aem_loc_enabled{};
    bool aem_ph_enabled{};
    long md_frequency{};
    std::list<std::string> no_code_capi_domains;
};
}

#endif /* TINY_CPP_CLIENT_ConversionTagConfigs_H_ */
