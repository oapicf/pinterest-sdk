#' Create a new CatalogsHotelProductMetadata
#'
#' @description
#' Hotel product metadata entity
#'
#' @docType class
#' @title CatalogsHotelProductMetadata
#' @description CatalogsHotelProductMetadata Class
#' @format An \code{R6Class} generator object
#' @field hotel_id The user-created unique ID that represents the hotel item. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductMetadata <- R6::R6Class(
  "CatalogsHotelProductMetadata",
  public = list(
    `hotel_id` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelProductMetadata class.
    #'
    #' @param hotel_id The user-created unique ID that represents the hotel item.
    #' @param ... Other optional arguments.
    initialize = function(`hotel_id`, ...) {
      if (!missing(`hotel_id`)) {
        if (!(is.character(`hotel_id`) && length(`hotel_id`) == 1)) {
          stop(paste("Error! Invalid data for `hotel_id`. Must be a string:", `hotel_id`))
        }
        self$`hotel_id` <- `hotel_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductMetadata in JSON format
    toJSON = function() {
      CatalogsHotelProductMetadataObject <- list()
      if (!is.null(self$`hotel_id`)) {
        CatalogsHotelProductMetadataObject[["hotel_id"]] <-
          self$`hotel_id`
      }
      CatalogsHotelProductMetadataObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hotel_id`)) {
        self$`hotel_id` <- this_object$`hotel_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductMetadata in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`hotel_id`)) {
          sprintf(
          '"hotel_id":
            "%s"
                    ',
          self$`hotel_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hotel_id` <- this_object$`hotel_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelProductMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hotel_id`
      if (!is.null(input_json$`hotel_id`)) {
        if (!(is.character(input_json$`hotel_id`) && length(input_json$`hotel_id`) == 1)) {
          stop(paste("Error! Invalid data for `hotel_id`. Must be a string:", input_json$`hotel_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductMetadata: the required field `hotel_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelProductMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `hotel_id` is null
      if (is.null(self$`hotel_id`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `hotel_id` is null
      if (is.null(self$`hotel_id`)) {
        invalid_fields["hotel_id"] <- "Non-nullable required field `hotel_id` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsHotelProductMetadata$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProductMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProductMetadata$lock()

