#' Create a new CatalogsHotelProduct
#'
#' @description
#' CatalogsHotelProduct Class
#'
#' @docType class
#' @title CatalogsHotelProduct
#' @description CatalogsHotelProduct Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field metadata  \link{CatalogsHotelProductMetadata}
#' @field pin  \link{Pin}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelProduct <- R6::R6Class(
  "CatalogsHotelProduct",
  public = list(
    `catalog_type` = NULL,
    `metadata` = NULL,
    `pin` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelProduct class.
    #'
    #' @param catalog_type catalog_type
    #' @param metadata metadata
    #' @param pin pin
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `metadata`, `pin`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`metadata`)) {
        stopifnot(R6::is.R6(`metadata`))
        self$`metadata` <- `metadata`
      }
      if (!missing(`pin`)) {
        stopifnot(R6::is.R6(`pin`))
        self$`pin` <- `pin`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProduct in JSON format
    toJSON = function() {
      CatalogsHotelProductObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelProductObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`metadata`)) {
        CatalogsHotelProductObject[["metadata"]] <-
          self$`metadata`$toJSON()
      }
      if (!is.null(self$`pin`)) {
        CatalogsHotelProductObject[["pin"]] <-
          self$`pin`$toJSON()
      }
      CatalogsHotelProductObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProduct
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProduct
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`metadata`)) {
        `metadata_object` <- CatalogsHotelProductMetadata$new()
        `metadata_object`$fromJSON(jsonlite::toJSON(this_object$`metadata`, auto_unbox = TRUE, digits = NA))
        self$`metadata` <- `metadata_object`
      }
      if (!is.null(this_object$`pin`)) {
        `pin_object` <- Pin$new()
        `pin_object`$fromJSON(jsonlite::toJSON(this_object$`pin`, auto_unbox = TRUE, digits = NA))
        self$`pin` <- `pin_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelProduct in JSON format
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
        if (!is.null(self$`metadata`)) {
          sprintf(
          '"metadata":
          %s
          ',
          jsonlite::toJSON(self$`metadata`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`pin`)) {
          sprintf(
          '"pin":
          %s
          ',
          jsonlite::toJSON(self$`pin`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelProduct
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelProduct
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("HOTEL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"HOTEL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`metadata` <- CatalogsHotelProductMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`metadata`, auto_unbox = TRUE, digits = NA))
      self$`pin` <- Pin$new()$fromJSON(jsonlite::toJSON(this_object$`pin`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelProduct and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProduct: the required field `catalog_type` is missing."))
      }
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
        stopifnot(R6::is.R6(input_json$`metadata`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProduct: the required field `metadata` is missing."))
      }
      # check the required field `pin`
      if (!is.null(input_json$`pin`)) {
        stopifnot(R6::is.R6(input_json$`pin`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelProduct: the required field `pin` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelProduct
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

      # check if the required `metadata` is null
      if (is.null(self$`metadata`)) {
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

      # check if the required `metadata` is null
      if (is.null(self$`metadata`)) {
        invalid_fields["metadata"] <- "Non-nullable required field `metadata` cannot be null."
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
# CatalogsHotelProduct$unlock()
#
## Below is an example to define the print function
# CatalogsHotelProduct$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelProduct$lock()

