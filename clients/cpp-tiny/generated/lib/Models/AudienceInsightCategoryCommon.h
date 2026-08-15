
/*
 * AudienceInsightCategoryCommon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceInsightCategoryCommon_H_
#define TINY_CPP_CLIENT_AudienceInsightCategoryCommon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceInsightCategoryCommon{
public:

    /*! \brief Constructor.
	 */
    AudienceInsightCategoryCommon();
    AudienceInsightCategoryCommon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceInsightCategoryCommon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	long getIndex();

	/*! \brief Set 
	 */
	void setIndex(long  index);
	/*! \brief Get 
	 */
	std::string getKey();

	/*! \brief Set 
	 */
	void setKey(std::string  key);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	long getRatio();

	/*! \brief Set 
	 */
	void setRatio(long  ratio);


    private:
    std::string id{};
    long index{};
    std::string key{};
    std::string name{};
    long ratio{};
};
}

#endif /* TINY_CPP_CLIENT_AudienceInsightCategoryCommon_H_ */
