
/*
 * FrequencyGoalMetadata.h
 *
 * Frequency target can only be between 2 and 20
 */

#ifndef TINY_CPP_CLIENT_FrequencyGoalMetadata_H_
#define TINY_CPP_CLIENT_FrequencyGoalMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FrequencyGoalMetadataTimerange.h"

namespace Tiny {


/*! \brief Frequency target can only be between 2 and 20
 *
 *  \ingroup Models
 *
 */

class FrequencyGoalMetadata{
public:

    /*! \brief Constructor.
	 */
    FrequencyGoalMetadata();
    FrequencyGoalMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FrequencyGoalMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getFrequency();

	/*! \brief Set 
	 */
	void setFrequency(int frequency);
	/*! \brief Get 
	 */
	FrequencyGoalMetadataTimerange getTimerange();

	/*! \brief Set 
	 */
	void setTimerange(FrequencyGoalMetadataTimerange timerange);


    private:
    int frequency{};
    FrequencyGoalMetadataTimerange timerange;
};
}

#endif /* TINY_CPP_CLIENT_FrequencyGoalMetadata_H_ */
