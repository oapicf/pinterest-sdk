/*
 * ConversionTagConfigs.h
 *
 * 
 */

#ifndef _ConversionTagConfigs_H_
#define _ConversionTagConfigs_H_


#include <string>
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

class ConversionTagConfigs : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionTagConfigs();
	ConversionTagConfigs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionTagConfigs();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	bool getAemEnabled();

	/*! \brief Set Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	void setAemEnabled(bool  aem_enabled);
	/*! \brief Get Metadata ingestion frequency.
	 */
	long long getMdFrequency();

	/*! \brief Set Metadata ingestion frequency.
	 */
	void setMdFrequency(long long  md_frequency);
	/*! \brief Get Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	bool getAemFnlnEnabled();

	/*! \brief Set Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	void setAemFnlnEnabled(bool  aem_fnln_enabled);
	/*! \brief Get Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	bool getAemPhEnabled();

	/*! \brief Set Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	void setAemPhEnabled(bool  aem_ph_enabled);
	/*! \brief Get Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	bool getAemGeEnabled();

	/*! \brief Set Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	void setAemGeEnabled(bool  aem_ge_enabled);
	/*! \brief Get Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	bool getAemDbEnabled();

	/*! \brief Set Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	void setAemDbEnabled(bool  aem_db_enabled);
	/*! \brief Get Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	bool getAemLocEnabled();

	/*! \brief Set Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
	 */
	void setAemLocEnabled(bool  aem_loc_enabled);

private:
	bool aem_enabled;
	long long md_frequency;
	bool aem_fnln_enabled;
	bool aem_ph_enabled;
	bool aem_ge_enabled;
	bool aem_db_enabled;
	bool aem_loc_enabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionTagConfigs_H_ */
