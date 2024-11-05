#' Create a new PinMediaSourceImageURL
#'
#' @description
#' Image URL-based media source
#'
#' @docType class
#' @title PinMediaSourceImageURL
#' @description PinMediaSourceImageURL Class
#' @format An \code{R6Class} generator object
#' @field source_type  character
#' @field url  character
#' @field is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImageURL <- R6::R6Class(
  "PinMediaSourceImageURL",
  public = list(
    `source_type` = NULL,
    `url` = NULL,
    `is_standard` = NULL,

    #' @description
    #' Initialize a new PinMediaSourceImageURL class.
    #'
    #' @param source_type source_type
    #' @param url url
    #' @param is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.. Default to TRUE.
    #' @param ... Other optional arguments.
    initialize = function(`source_type`, `url`, `is_standard` = TRUE, ...) {
      if (!missing(`source_type`)) {
        if (!(`source_type` %in% c("image_url"))) {
          stop(paste("Error! \"", `source_type`, "\" cannot be assigned to `source_type`. Must be \"image_url\".", sep = ""))
        }
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`is_standard`)) {
        if (!(is.logical(`is_standard`) && length(`is_standard`) == 1)) {
          stop(paste("Error! Invalid data for `is_standard`. Must be a boolean:", `is_standard`))
        }
        self$`is_standard` <- `is_standard`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImageURL in JSON format
    toJSON = function() {
      PinMediaSourceImageURLObject <- list()
      if (!is.null(self$`source_type`)) {
        PinMediaSourceImageURLObject[["source_type"]] <-
          self$`source_type`
      }
      if (!is.null(self$`url`)) {
        PinMediaSourceImageURLObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`is_standard`)) {
        PinMediaSourceImageURLObject[["is_standard"]] <-
          self$`is_standard`
      }
      PinMediaSourceImageURLObject
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImageURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImageURL
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`)) {
        if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("image_url"))) {
          stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"image_url\".", sep = ""))
        }
        self$`source_type` <- this_object$`source_type`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`is_standard`)) {
        self$`is_standard` <- this_object$`is_standard`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImageURL in JSON format
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
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`is_standard`)) {
          sprintf(
          '"is_standard":
            %s
                    ',
          tolower(self$`is_standard`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImageURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImageURL
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("image_url"))) {
        stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"image_url\".", sep = ""))
      }
      self$`source_type` <- this_object$`source_type`
      self$`url` <- this_object$`url`
      self$`is_standard` <- this_object$`is_standard`
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaSourceImageURL and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImageURL: the required field `source_type` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImageURL: the required field `url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImageURL
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

      # check if the required `url` is null
      if (is.null(self$`url`)) {
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

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
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
# PinMediaSourceImageURL$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImageURL$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImageURL$lock()

