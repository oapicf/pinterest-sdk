
/*
 * DynamicTitlesGetStatus.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DynamicTitlesGetStatus_H_
#define TINY_CPP_CLIENT_DynamicTitlesGetStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesGetStatus{
public:

    /*! \brief Constructor.
	 */
    DynamicTitlesGetStatus();
    DynamicTitlesGetStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DynamicTitlesGetStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The count of generated titles.
	 */
	int getGeneratedCount();

	/*! \brief Set The count of generated titles.
	 */
	void setGeneratedCount(int generated_count);
	/*! \brief Get Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
	 */
	bool isIsReady();

	/*! \brief Set Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
	 */
	void setIsReady(bool is_ready);
	/*! \brief Get The count of advertiser reviewed titles.
	 */
	int getReviewedCount();

	/*! \brief Set The count of advertiser reviewed titles.
	 */
	void setReviewedCount(int reviewed_count);


    private:
    int generated_count{};
    bool is_ready{};
    int reviewed_count{};
};
}

#endif /* TINY_CPP_CLIENT_DynamicTitlesGetStatus_H_ */
