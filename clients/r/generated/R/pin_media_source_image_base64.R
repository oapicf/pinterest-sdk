#' Create a new PinMediaSourceImageBase64
#'
#' @description
#' Base64-encoded image media source
#'
#' @docType class
#' @title PinMediaSourceImageBase64
#' @description PinMediaSourceImageBase64 Class
#' @format An \code{R6Class} generator object
#' @field source_type  character
#' @field content_type  character
#' @field data  character
#' @field is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImageBase64 <- R6::R6Class(
  "PinMediaSourceImageBase64",
  public = list(
    `source_type` = NULL,
    `content_type` = NULL,
    `data` = NULL,
    `is_standard` = NULL,
    #' Initialize a new PinMediaSourceImageBase64 class.
    #'
    #' @description
    #' Initialize a new PinMediaSourceImageBase64 class.
    #'
    #' @param source_type source_type
    #' @param content_type content_type
    #' @param data data
    #' @param is_standard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.. Default to TRUE.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`source_type`, `content_type`, `data`, `is_standard` = TRUE, ...) {
      if (!missing(`source_type`)) {
        if (!(`source_type` %in% c("image_base64"))) {
          stop(paste("Error! \"", `source_type`, "\" cannot be assigned to `source_type`. Must be \"image_base64\".", sep = ""))
        }
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!missing(`content_type`)) {
        if (!(`content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", `content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        if (!(is.character(`content_type`) && length(`content_type`) == 1)) {
          stop(paste("Error! Invalid data for `content_type`. Must be a string:", `content_type`))
        }
        self$`content_type` <- `content_type`
      }
      if (!missing(`data`)) {
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
        self$`data` <- `data`
      }
      if (!is.null(`is_standard`)) {
        if (!(is.logical(`is_standard`) && length(`is_standard`) == 1)) {
          stop(paste("Error! Invalid data for `is_standard`. Must be a boolean:", `is_standard`))
        }
        self$`is_standard` <- `is_standard`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImageBase64 in JSON format
    #' @export
    toJSON = function() {
      PinMediaSourceImageBase64Object <- list()
      if (!is.null(self$`source_type`)) {
        PinMediaSourceImageBase64Object[["source_type"]] <-
          self$`source_type`
      }
      if (!is.null(self$`content_type`)) {
        PinMediaSourceImageBase64Object[["content_type"]] <-
          self$`content_type`
      }
      if (!is.null(self$`data`)) {
        PinMediaSourceImageBase64Object[["data"]] <-
          self$`data`
      }
      if (!is.null(self$`is_standard`)) {
        PinMediaSourceImageBase64Object[["is_standard"]] <-
          self$`is_standard`
      }
      PinMediaSourceImageBase64Object
    },
    #' Deserialize JSON string into an instance of PinMediaSourceImageBase64
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImageBase64
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImageBase64
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`)) {
        if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("image_base64"))) {
          stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"image_base64\".", sep = ""))
        }
        self$`source_type` <- this_object$`source_type`
      }
      if (!is.null(this_object$`content_type`)) {
        if (!is.null(this_object$`content_type`) && !(this_object$`content_type` %in% c("image/jpeg", "image/png"))) {
          stop(paste("Error! \"", this_object$`content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
        }
        self$`content_type` <- this_object$`content_type`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- this_object$`data`
      }
      if (!is.null(this_object$`is_standard`)) {
        self$`is_standard` <- this_object$`is_standard`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImageBase64 in JSON format
    #' @export
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
        if (!is.null(self$`content_type`)) {
          sprintf(
          '"content_type":
            "%s"
                    ',
          self$`content_type`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
            "%s"
                    ',
          self$`data`
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
    #' Deserialize JSON string into an instance of PinMediaSourceImageBase64
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImageBase64
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImageBase64
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("image_base64"))) {
        stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"image_base64\".", sep = ""))
      }
      self$`source_type` <- this_object$`source_type`
      if (!is.null(this_object$`content_type`) && !(this_object$`content_type` %in% c("image/jpeg", "image/png"))) {
        stop(paste("Error! \"", this_object$`content_type`, "\" cannot be assigned to `content_type`. Must be \"image/jpeg\", \"image/png\".", sep = ""))
      }
      self$`content_type` <- this_object$`content_type`
      self$`data` <- this_object$`data`
      self$`is_standard` <- this_object$`is_standard`
      self
    },
    #' Validate JSON input with respect to PinMediaSourceImageBase64
    #'
    #' @description
    #' Validate JSON input with respect to PinMediaSourceImageBase64 and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `source_type`
      if (!is.null(input_json$`source_type`)) {
        if (!(is.character(input_json$`source_type`) && length(input_json$`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", input_json$`source_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImageBase64: the required field `source_type` is missing."))
      }
      # check the required field `content_type`
      if (!is.null(input_json$`content_type`)) {
        if (!(is.character(input_json$`content_type`) && length(input_json$`content_type`) == 1)) {
          stop(paste("Error! Invalid data for `content_type`. Must be a string:", input_json$`content_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImageBase64: the required field `content_type` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        if (!(is.character(input_json$`data`) && length(input_json$`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", input_json$`data`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImageBase64: the required field `data` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImageBase64
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
      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        return(FALSE)
      }

      # check if the required `content_type` is null
      if (is.null(self$`content_type`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      if (!str_detect(self$`data`, "[a-zA-Z0-9+/=]+")) {
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
      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        invalid_fields["source_type"] <- "Non-nullable required field `source_type` cannot be null."
      }

      # check if the required `content_type` is null
      if (is.null(self$`content_type`)) {
        invalid_fields["content_type"] <- "Non-nullable required field `content_type` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      if (!str_detect(self$`data`, "[a-zA-Z0-9+/=]+")) {
        invalid_fields["data"] <- "Invalid value for `data`, must conform to the pattern [a-zA-Z0-9+/=]+."
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
# PinMediaSourceImageBase64$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImageBase64$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImageBase64$lock()

