#' @docType class
#' @title PinMediaMetadata
#'
#' @description PinMediaMetadata Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaMetadata <- R6::R6Class(
  "PinMediaMetadata",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field any_of  a list of object types defined in the anyOf schema.
    any_of = list("ImageMetadata", "VideoMetadata"),
    #' Initialize a new PinMediaMetadata.
    #'
    #' @description
    #' Initialize a new PinMediaMetadata.
    #'
    #' @param instance an instance of the object defined in the anyOf schemas: "ImageMetadata", "VideoMetadata"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ImageMetadata") {
        self$actual_instance <- instance
        self$actual_type <- "ImageMetadata"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "VideoMetadata") {
        self$actual_instance <- instance
        self$actual_type <- "VideoMetadata"
      } else {
        stop(paste("Failed to initialize PinMediaMetadata with anyOf schemas ImageMetadata, VideoMetadata. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of PinMediaMetadata.
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaMetadata.
    #' An alias to the method `fromJSON`.
    #'
    #' @param input The input JSON.
    #' @return An instance of PinMediaMetadata.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of PinMediaMetadata.
    #'
    #' @description
    #' Deserialize JSON string into an instance of PinMediaMetadata.
    #'
    #' @param input The input JSON.
    #' @return An instance of PinMediaMetadata.
    #' @export
    fromJSON = function(input) {
      error_messages <- list()

      `ImageMetadata_result` <- tryCatch({
          `ImageMetadata`$public_methods$validateJSON(input)
          `ImageMetadata_instance` <- `ImageMetadata`$new()
          self$actual_instance <- `ImageMetadata_instance`$fromJSON(input)
          self$actual_type <- "ImageMetadata"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`ImageMetadata_result`["error"])) {
        error_messages <- append(error_messages, `ImageMetadata_result`["message"])
      }

      `VideoMetadata_result` <- tryCatch({
          `VideoMetadata`$public_methods$validateJSON(input)
          `VideoMetadata_instance` <- `VideoMetadata`$new()
          self$actual_instance <- `VideoMetadata_instance`$fromJSON(input)
          self$actual_type <- "VideoMetadata"
          return(self)
        },
        error = function(err) err
      )

      if (!is.null(`VideoMetadata_result`["error"])) {
        error_messages <- append(error_messages, `VideoMetadata_result`["message"])
      }

      # no match
      stop(paste("No match found when deserializing the input into PinMediaMetadata with anyOf schemas ImageMetadata, VideoMetadata. Details: >>",
                 paste(error_messages, collapse = " >> ")))
    },
    #' Serialize PinMediaMetadata to JSON string.
    #'
    #' @description
    #' Serialize PinMediaMetadata to JSON string.
    #'
    #' @return JSON string representation of the PinMediaMetadata.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify((self$actual_instance$toJSONString())))
      } else {
        NULL
      }
    },
    #' Serialize PinMediaMetadata to JSON.
    #'
    #' @description
    #' Serialize PinMediaMetadata to JSON.
    #'
    #' @return JSON representation of the PinMediaMetadata.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to PinMediaMetadata.
    #'
    #' @description
    #' Validate the input JSON with respect to PinMediaMetadata and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    #' @export
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
    #' Returns the string representation of the instance.
    #'
    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    #' @export
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"any_of": "%s"', paste(unlist(self$any_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#PinMediaMetadata$unlock()
#
## Below is an example to define the print function
#PinMediaMetadata$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#PinMediaMetadata$lock()

