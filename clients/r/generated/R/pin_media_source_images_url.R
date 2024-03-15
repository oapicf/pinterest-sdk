#' Create a new PinMediaSourceImagesURL
#'
#' @description
#' Multiple images urls-based media source
#'
#' @docType class
#' @title PinMediaSourceImagesURL
#' @description PinMediaSourceImagesURL Class
#' @format An \code{R6Class} generator object
#' @field source_type  character [optional]
#' @field items Array with image objects. list(\link{PinMediaSourceImagesURLItemsInner})
#' @field index  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSourceImagesURL <- R6::R6Class(
  "PinMediaSourceImagesURL",
  public = list(
    `source_type` = NULL,
    `items` = NULL,
    `index` = NULL,
    #' Initialize a new PinMediaSourceImagesURL class.
    #'
    #' @description
    #' Initialize a new PinMediaSourceImagesURL class.
    #'
    #' @param items Array with image objects.
    #' @param source_type source_type
    #' @param index index
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`items`, `source_type` = NULL, `index` = NULL, ...) {
      if (!missing(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
      if (!is.null(`source_type`)) {
        if (!(`source_type` %in% c("multiple_image_urls"))) {
          stop(paste("Error! \"", `source_type`, "\" cannot be assigned to `source_type`. Must be \"multiple_image_urls\".", sep = ""))
        }
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!is.null(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImagesURL in JSON format
    #' @export
    toJSON = function() {
      PinMediaSourceImagesURLObject <- list()
      if (!is.null(self$`source_type`)) {
        PinMediaSourceImagesURLObject[["source_type"]] <-
          self$`source_type`
      }
      if (!is.null(self$`items`)) {
        PinMediaSourceImagesURLObject[["items"]] <-
          lapply(self$`items`, function(x) x$toJSON())
      }
      if (!is.null(self$`index`)) {
        PinMediaSourceImagesURLObject[["index"]] <-
          self$`index`
      }
      PinMediaSourceImagesURLObject
    },
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURL
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURL
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`)) {
        if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("multiple_image_urls"))) {
          stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"multiple_image_urls\".", sep = ""))
        }
        self$`source_type` <- this_object$`source_type`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaSourceImagesURLItemsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return PinMediaSourceImagesURL in JSON format
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
        if (!is.null(self$`items`)) {
          sprintf(
          '"items":
          [%s]
',
          paste(sapply(self$`items`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURL
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaSourceImagesURL
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaSourceImagesURL
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`source_type`) && !(this_object$`source_type` %in% c("multiple_image_urls"))) {
        stop(paste("Error! \"", this_object$`source_type`, "\" cannot be assigned to `source_type`. Must be \"multiple_image_urls\".", sep = ""))
      }
      self$`source_type` <- this_object$`source_type`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaSourceImagesURLItemsInner]", loadNamespace("openapi"))
      self$`index` <- this_object$`index`
      self
    },
    #' Validate JSON input with respect to PinMediaSourceImagesURL
    #'
    #' @description
    #' Validate JSON input with respect to PinMediaSourceImagesURL and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `items`
      if (!is.null(input_json$`items`)) {
        stopifnot(is.vector(input_json$`items`), length(input_json$`items`) != 0)
        tmp <- sapply(input_json$`items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PinMediaSourceImagesURL: the required field `items` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaSourceImagesURL
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        return(FALSE)
      }

      if (length(self$`items`) > 5) {
        return(FALSE)
      }
      if (length(self$`items`) < 2) {
        return(FALSE)
      }

      if (self$`index` < 0) {
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
      # check if the required `items` is null
      if (is.null(self$`items`)) {
        invalid_fields["items"] <- "Non-nullable required field `items` cannot be null."
      }

      if (length(self$`items`) > 5) {
        invalid_fields["items"] <- "Invalid length for `items`, number of items must be less than or equal to 5."
      }
      if (length(self$`items`) < 2) {
        invalid_fields["items"] <- "Invalid length for ``, number of items must be greater than or equal to 2."
      }

      if (self$`index` < 0) {
        invalid_fields["index"] <- "Invalid value for `index`, must be bigger than or equal to 0."
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
# PinMediaSourceImagesURL$unlock()
#
## Below is an example to define the print function
# PinMediaSourceImagesURL$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaSourceImagesURL$lock()

