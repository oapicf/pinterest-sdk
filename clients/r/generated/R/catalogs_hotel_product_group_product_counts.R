#' Create a new CatalogsHotelProductGroupProductCounts
#'
#' @description
#' Product counts for a Hotel CatalogsProductGroup
#'
#' @docType class
#' @title CatalogsHotelProductGroupProductCounts
#' @description CatalogsHotelProductGroupProductCounts Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field total  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProductGroupProductCounts <- R6::R6Class(
  "CatalogsHotelProductGroupProductCounts",
  public = list(
    `catalog_type` = NULL,
    `total` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelProductGroupProductCounts class.
    #'
    #' @param catalog_type catalog_type
    #' @param total total
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `total`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`total`)) {
        self$`total` <- `total`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupProductCounts in JSON format
    toJSON = function() {
      CatalogsHotelProductGroupProductCountsObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelProductGroupProductCountsObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`total`)) {
        CatalogsHotelProductGroupProductCountsObject[["total"]] <-
          self$`total`
      }
      CatalogsHotelProductGroupProductCountsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupProductCounts
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProductGroupProductCounts in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
            "%s"
                    ',
          self$`catalog_type`
          )
        },
        if (!is.null(self$`total`)) {
          sprintf(
          '"total":
            %d
                    ',
          self$`total`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProductGroupProductCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`total` <- this_object$`total`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelProductGroupProductCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupProductCounts: the required field `catalog_type` is missing."))
      }
      # check the required field `total`
      if (!is.null(input_json$`total`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProductGroupProductCounts: the required field `total` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelProductGroupProductCounts
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        return(FALSE)
      }

      if (self$`total` < 0) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        invalid_fields["total"] <- "Non-nullable required field `total` cannot be null."
      }

      if (self$`total` < 0) {
        invalid_fields["total"] <- "Invalid value for `total`, must be bigger than or equal to 0."
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
# CatalogsHotelProductGroupProductCounts$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProductGroupProductCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProductGroupProductCounts$lock()

