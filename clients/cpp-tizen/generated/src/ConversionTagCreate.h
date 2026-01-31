/*
 * ConversionTagCreate.h
 *
 * Resource create operation model.
 */

#ifndef _ConversionTagCreate_H_
#define _ConversionTagCreate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class ConversionTagCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionTagCreate();
	ConversionTagCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionTagCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool getAemDbEnabled();

	/*! \brief Set Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemDbEnabled(bool  aem_db_enabled);
	/*! \brief Get Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool getAemEnabled();

	/*! \brief Set Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemEnabled(bool  aem_enabled);
	/*! \brief Get Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool getAemExternalIdEnabled();

	/*! \brief Set Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemExternalIdEnabled(bool  aem_external_id_enabled);
	/*! \brief Get Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool getAemFnlnEnabled();

	/*! \brief Set Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemFnlnEnabled(bool  aem_fnln_enabled);
	/*! \brief Get Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool getAemGeEnabled();

	/*! \brief Set Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemGeEnabled(bool  aem_ge_enabled);
	/*! \brief Get Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool getAemLocEnabled();

	/*! \brief Set Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemLocEnabled(bool  aem_loc_enabled);
	/*! \brief Get Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	bool getAemPhEnabled();

	/*! \brief Set Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
	 */
	void setAemPhEnabled(bool  aem_ph_enabled);
	/*! \brief Get Metadata ingestion frequency.
	 */
	long long getMdFrequency();

	/*! \brief Set Metadata ingestion frequency.
	 */
	void setMdFrequency(long long  md_frequency);
	/*! \brief Get Conversion tag name.
	 */
	std::string getName();

	/*! \brief Set Conversion tag name.
	 */
	void setName(std::string  name);

private:
	bool aem_db_enabled;
	bool aem_enabled;
	bool aem_external_id_enabled;
	bool aem_fnln_enabled;
	bool aem_ge_enabled;
	bool aem_loc_enabled;
	bool aem_ph_enabled;
	long long md_frequency;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionTagCreate_H_ */
