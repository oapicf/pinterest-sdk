#' Create a new CatalogsHotelItemResponse
#'
#' @description
#' Object describing a hotel record
#'
#' @docType class
#' @title CatalogsHotelItemResponse
#' @description CatalogsHotelItemResponse Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  \link{CatalogsType}
#' @field hotel_id The catalog hotel id in the merchant namespace character [optional]
#' @field pins The pins mapped to the item list(\link{Pin}) [optional]
#' @field attributes  \link{CatalogsHotelAttributes} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelItemResponse <- R6::R6Class(
  "CatalogsHotelItemResponse",
  public = list(
    `catalog_type` = NULL,
    `hotel_id` = NULL,
    `pins` = NULL,
    `attributes` = NULL,
    #' Initialize a new CatalogsHotelItemResponse class.
    #'
    #' @description
    #' Initialize a new CatalogsHotelItemResponse class.
    #'
    #' @param catalog_type catalog_type
    #' @param hotel_id The catalog hotel id in the merchant namespace
    #' @param pins The pins mapped to the item
    #' @param attributes attributes
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`catalog_type`, `hotel_id` = NULL, `pins` = NULL, `attributes` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!is.null(`hotel_id`)) {
        if (!(is.character(`hotel_id`) && length(`hotel_id`) == 1)) {
          stop(paste("Error! Invalid data for `hotel_id`. Must be a string:", `hotel_id`))
        }
        self$`hotel_id` <- `hotel_id`
      }
      if (!is.null(`pins`)) {
        stopifnot(is.vector(`pins`), length(`pins`) != 0)
        sapply(`pins`, function(x) stopifnot(R6::is.R6(x)))
        self$`pins` <- `pins`
      }
      if (!is.null(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelItemResponse in JSON format
    #' @export
    toJSON = function() {
      CatalogsHotelItemResponseObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsHotelItemResponseObject[["catalog_type"]] <-
          self$`catalog_type`$toJSON()
      }
      if (!is.null(self$`hotel_id`)) {
        CatalogsHotelItemResponseObject[["hotel_id"]] <-
          self$`hotel_id`
      }
      if (!is.null(self$`pins`)) {
        CatalogsHotelItemResponseObject[["pins"]] <-
          lapply(self$`pins`, function(x) x$toJSON())
      }
      if (!is.null(self$`attributes`)) {
        CatalogsHotelItemResponseObject[["attributes"]] <-
          self$`attributes`$toJSON()
      }
      CatalogsHotelItemResponseObject
    },
    #' Deserialize JSON string into an instance of CatalogsHotelItemResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelItemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelItemResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
      if (!is.null(this_object$`hotel_id`)) {
        self$`hotel_id` <- this_object$`hotel_id`
      }
      if (!is.null(this_object$`pins`)) {
        self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[Pin]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- CatalogsHotelAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelItemResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
          %s
          ',
          jsonlite::toJSON(self$`catalog_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`hotel_id`)) {
          sprintf(
          '"hotel_id":
            "%s"
                    ',
          self$`hotel_id`
          )
        },
        if (!is.null(self$`pins`)) {
          sprintf(
          '"pins":
          [%s]
',
          paste(sapply(self$`pins`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`attributes`)) {
          sprintf(
          '"attributes":
          %s
          ',
          jsonlite::toJSON(self$`attributes`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsHotelItemResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelItemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelItemResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`hotel_id` <- this_object$`hotel_id`
      self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[Pin]", loadNamespace("openapi"))
      self$`attributes` <- CatalogsHotelAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsHotelItemResponse
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsHotelItemResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsHotelItemResponse: the required field `catalog_type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelItemResponse
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      if (length(self$`pins`) > 11) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      if (length(self$`pins`) > 11) {
        invalid_fields["pins"] <- "Invalid length for `pins`, number of items must be less than or equal to 11."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsHotelItemResponse$unlock()
#
## Below is an example to define the print function
# CatalogsHotelItemResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelItemResponse$lock()

