#' @docType class
#' @title PinMediaSource
#'
#' @description PinMediaSource Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaSource <- R6::R6Class(
  "PinMediaSource",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("PinMediaSourceImageBase64", "PinMediaSourceImageURL", "PinMediaSourceImagesBase64", "PinMediaSourceImagesURL", "PinMediaSourcePinURL", "PinMediaSourceVideoID"),

    #' @description
    #' Initialize a new PinMediaSource.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "PinMediaSourceImageBase64", "PinMediaSourceImageURL", "PinMediaSourceImagesBase64", "PinMediaSourceImagesURL", "PinMediaSourcePinURL", "PinMediaSourceVideoID"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaSourceImageBase64") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaSourceImageBase64"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaSourceImageURL") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaSourceImageURL"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaSourceImagesBase64") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaSourceImagesBase64"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaSourceImagesURL") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaSourceImagesURL"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaSourcePinURL") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaSourcePinURL"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaSourceVideoID") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaSourceVideoID"
      } else {
        stop(paste("Failed to initialize PinMediaSource with oneOf schemas PinMediaSourceImageBase64, PinMediaSourceImageURL, PinMediaSourceImagesBase64, PinMediaSourceImagesURL, PinMediaSourcePinURL, PinMediaSourceVideoID. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSource.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of PinMediaSource.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaSource.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of PinMediaSource.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `PinMediaSourceImageBase64_result` <- tryCatch({
          `PinMediaSourceImageBase64`$public_methods$validateJSON(input)
          `PinMediaSourceImageBase64_instance` <- `PinMediaSourceImageBase64`$new()
          instance <- `PinMediaSourceImageBase64_instance`$fromJSON(input)
          instance_type <- "PinMediaSourceImageBase64"
          matched_schemas <- append(matched_schemas, "PinMediaSourceImageBase64")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaSourceImageBase64_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaSourceImageBase64_result`["message"])
      }

      `PinMediaSourceImageURL_result` <- tryCatch({
          `PinMediaSourceImageURL`$public_methods$validateJSON(input)
          `PinMediaSourceImageURL_instance` <- `PinMediaSourceImageURL`$new()
          instance <- `PinMediaSourceImageURL_instance`$fromJSON(input)
          instance_type <- "PinMediaSourceImageURL"
          matched_schemas <- append(matched_schemas, "PinMediaSourceImageURL")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaSourceImageURL_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaSourceImageURL_result`["message"])
      }

      `PinMediaSourceVideoID_result` <- tryCatch({
          `PinMediaSourceVideoID`$public_methods$validateJSON(input)
          `PinMediaSourceVideoID_instance` <- `PinMediaSourceVideoID`$new()
          instance <- `PinMediaSourceVideoID_instance`$fromJSON(input)
          instance_type <- "PinMediaSourceVideoID"
          matched_schemas <- append(matched_schemas, "PinMediaSourceVideoID")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaSourceVideoID_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaSourceVideoID_result`["message"])
      }

      `PinMediaSourceImagesBase64_result` <- tryCatch({
          `PinMediaSourceImagesBase64`$public_methods$validateJSON(input)
          `PinMediaSourceImagesBase64_instance` <- `PinMediaSourceImagesBase64`$new()
          instance <- `PinMediaSourceImagesBase64_instance`$fromJSON(input)
          instance_type <- "PinMediaSourceImagesBase64"
          matched_schemas <- append(matched_schemas, "PinMediaSourceImagesBase64")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaSourceImagesBase64_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaSourceImagesBase64_result`["message"])
      }

      `PinMediaSourceImagesURL_result` <- tryCatch({
          `PinMediaSourceImagesURL`$public_methods$validateJSON(input)
          `PinMediaSourceImagesURL_instance` <- `PinMediaSourceImagesURL`$new()
          instance <- `PinMediaSourceImagesURL_instance`$fromJSON(input)
          instance_type <- "PinMediaSourceImagesURL"
          matched_schemas <- append(matched_schemas, "PinMediaSourceImagesURL")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaSourceImagesURL_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaSourceImagesURL_result`["message"])
      }

      `PinMediaSourcePinURL_result` <- tryCatch({
          `PinMediaSourcePinURL`$public_methods$validateJSON(input)
          `PinMediaSourcePinURL_instance` <- `PinMediaSourcePinURL`$new()
          instance <- `PinMediaSourcePinURL_instance`$fromJSON(input)
          instance_type <- "PinMediaSourcePinURL"
          matched_schemas <- append(matched_schemas, "PinMediaSourcePinURL")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaSourcePinURL_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaSourcePinURL_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into PinMediaSource with oneOf schemas PinMediaSourceImageBase64, PinMediaSourceImageURL, PinMediaSourceImagesBase64, PinMediaSourceImagesURL, PinMediaSourcePinURL, PinMediaSourceVideoID. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into PinMediaSource with oneOf schemas PinMediaSourceImageBase64, PinMediaSourceImageURL, PinMediaSourceImagesBase64, PinMediaSourceImagesURL, PinMediaSourcePinURL, PinMediaSourceVideoID. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize PinMediaSource to JSON string.
    #'
    #' @return JSON string representation of the PinMediaSource.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize PinMediaSource to JSON.
    #'
    #' @return JSON representation of the PinMediaSource.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to PinMediaSource and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#PinMediaSource$unlock()
#
## Below is an example to define the print function
#PinMediaSource$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#PinMediaSource$lock()

