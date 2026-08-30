
/*
 * CatalogsHotelGuestRatings.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelGuestRatings_H_
#define TINY_CPP_CLIENT_CatalogsHotelGuestRatings_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelGuestRatings{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelGuestRatings();
    CatalogsHotelGuestRatings(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelGuestRatings();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Max value for the hotel rating score.
	 */
	long getMaxScore();

	/*! \brief Set Max value for the hotel rating score.
	 */
	void setMaxScore(long max_score);
	/*! \brief Get Total number of people who have rated this hotel.
	 */
	int getNumberOfReviewers();

	/*! \brief Set Total number of people who have rated this hotel.
	 */
	void setNumberOfReviewers(int number_of_reviewers);
	/*! \brief Get System you use for guest reviews.
	 */
	std::string getRatingSystem();

	/*! \brief Set System you use for guest reviews.
	 */
	void setRatingSystem(std::string rating_system);
	/*! \brief Get Your hotel's rating.
	 */
	long getScore();

	/*! \brief Set Your hotel's rating.
	 */
	void setScore(long score);


    private:
    long max_score{};
    int number_of_reviewers{};
    std::string rating_system{};
    long score{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelGuestRatings_H_ */
