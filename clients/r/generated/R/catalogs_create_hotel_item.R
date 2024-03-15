#' Create a new CatalogsCreateHotelItem
#'
#' @description
#' A hotel item to be created.
#'
#' @docType class
#' @title CatalogsCreateHotelItem
#' @description CatalogsCreateHotelItem Class
#' @format An \code{R6Class} generator object
#' @field hotel_id The catalog hotel id in the merchant namespace character
#' @field operation  character
#' @field attributes  \link{CatalogsHotelAttributes}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreateHotelItem <- R6::R6Class(
  "CatalogsCreateHotelItem",
  public = list(
    `hotel_id` = NULL,
    `operation` = NULL,
    `attributes` = NULL,
    #' Initialize a new CatalogsCreateHotelItem class.
    #'
    #' @description
    #' Initialize a new CatalogsCreateHotelItem class.
    #'
    #' @param hotel_id The catalog hotel id in the merchant namespace
    #' @param operation operation
    #' @param attributes attributes
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`hotel_id`, `operation`, `attributes`, ...) {
      if (!missing(`hotel_id`)) {
        if (!(is.character(`hotel_id`) && length(`hotel_id`) == 1)) {
          stop(paste("Error! Invalid data for `hotel_id`. Must be a string:", `hotel_id`))
        }
        self$`hotel_id` <- `hotel_id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
      if (!missing(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreateHotelItem in JSON format
    #' @export
    toJSON = function() {
      CatalogsCreateHotelItemObject <- list()
      if (!is.null(self$`hotel_id`)) {
        CatalogsCreateHotelItemObject[["hotel_id"]] <-
          self$`hotel_id`
      }
      if (!is.null(self$`operation`)) {
        CatalogsCreateHotelItemObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`attributes`)) {
        CatalogsCreateHotelItemObject[["attributes"]] <-
          self$`attributes`$toJSON()
      }
      CatalogsCreateHotelItemObject
    },
    #' Deserialize JSON string into an instance of CatalogsCreateHotelItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateHotelItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateHotelItem
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hotel_id`)) {
        self$`hotel_id` <- this_object$`hotel_id`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
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
    #' @return CatalogsCreateHotelItem in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`hotel_id`)) {
          sprintf(
          '"hotel_id":
            "%s"
                    ',
          self$`hotel_id`
          )
        },
        if (!is.null(self$`operation`)) {
          sprintf(
          '"operation":
            "%s"
                    ',
          self$`operation`
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
    #' Deserialize JSON string into an instance of CatalogsCreateHotelItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreateHotelItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreateHotelItem
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hotel_id` <- this_object$`hotel_id`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self$`attributes` <- CatalogsHotelAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsCreateHotelItem
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsCreateHotelItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hotel_id`
      if (!is.null(input_json$`hotel_id`)) {
        if (!(is.character(input_json$`hotel_id`) && length(input_json$`hotel_id`) == 1)) {
          stop(paste("Error! Invalid data for `hotel_id`. Must be a string:", input_json$`hotel_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreateHotelItem: the required field `hotel_id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreateHotelItem: the required field `operation` is missing."))
      }
      # check the required field `attributes`
      if (!is.null(input_json$`attributes`)) {
        stopifnot(R6::is.R6(input_json$`attributes`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreateHotelItem: the required field `attributes` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreateHotelItem
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
      # check if the required `hotel_id` is null
      if (is.null(self$`hotel_id`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
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
      # check if the required `hotel_id` is null
      if (is.null(self$`hotel_id`)) {
        invalid_fields["hotel_id"] <- "Non-nullable required field `hotel_id` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        invalid_fields["attributes"] <- "Non-nullable required field `attributes` cannot be null."
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
# CatalogsCreateHotelItem$unlock()
#
## Below is an example to define the print function
# CatalogsCreateHotelItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreateHotelItem$lock()

