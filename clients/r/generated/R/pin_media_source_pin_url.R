#' Create a new PinMediaSourcePinURL
#'
#' @description
#' Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
#'
#' @docType class
#' @title PinMediaSourcePinURL
#' @description PinMediaSourcePinURL Class
#' @format An \code{R6Class} generator object
#' @field source_type  character
#' @field is_affiliate_link This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourcePinURL <- R6::R6Class(
  "PinMediaSourcePinURL",
  public = list(
    `source_type` = NULL,
    `is_affiliate_link` = NULL,

    #' @description
    #' Initialize a new PinMediaSourcePinURL class.
    #'
    #' @param source_type source_type
    #' @param is_affiliate_link This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`source_type`, `is_affiliate_link` = FALSE, ...) {
      if (!missing(`source_type`)) {
        if (!(`source_type` %in% c("pin_url"))) {
          stop(paste("Error! \"", `source_type`, "\" cannot be assigned to `source_type`. Must be \"pin_url\".", sep = ""))
        }
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!is.null(`is_affiliate_link`)) {
        if (!(is.logical(`is_affiliate_link`) && length(`is_affiliate_link`) == 1)) {
          stop(paste("Error! Invalid data for `is_affiliate_link`. Must be a boolean:", `is_affiliate_link`))
        }
        self$`is_affiliate_link` <- `is_affiliate_link`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourcePinURL in JSON format
    toJSON = function() {
      PinMediaSourcePinURLObject <- list()
      if (!is.null(self$`source_type`)) {
        PinMediaSourcePinURLObject[["source_type"]] <-
          self$`source_type`
      }
      if (!is.null(self$`is_affiliate_link`)) {
        PinMediaSourcePinURLObject[["is_affiliate_link"]] <-
          self$`is_affiliate_link`
      }
      PinMediaSourcePinURLObject
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourcePinURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourcePinURL
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`)) {
        if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("pin_url"))) {
          stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"pin_url\".", sep = ""))
        }
        self$`source_type` <- this_object$`source_type`
      }
      if (!is.null(this_object$`is_affiliate_link`)) {
        self$`is_affiliate_link` <- this_object$`is_affiliate_link`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourcePinURL in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`source_type`)) {
          sprintf(
          '"source_type":
            "%s"
                    ',
          self$`source_type`
          )
        },
        if (!is.null(self$`is_affiliate_link`)) {
          sprintf(
          '"is_affiliate_link":
            %s
                    ',
          tolower(self$`is_affiliate_link`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourcePinURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourcePinURL
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("pin_url"))) {
        stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"pin_url\".", sep = ""))
      }
      self$`source_type` <- this_object$`source_type`
      self$`is_affiliate_link` <- this_object$`is_affiliate_link`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaSourcePinURL and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `source_type`
      if (!is.null(input_json$`source_type`)) {
        if (!(is.character(input_json$`source_type`) && length(input_json$`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", input_json$`source_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourcePinURL: the required field `source_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourcePinURL
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
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
      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        invalid_fields["source_type"] <- "Non-nullable required field `source_type` cannot be null."
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
# PinMediaSourcePinURL$unlock()
#
## Below is an example to define the print function
# PinMediaSourcePinURL$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourcePinURL$lock()

