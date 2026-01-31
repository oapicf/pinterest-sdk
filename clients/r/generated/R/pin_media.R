#' @docType class
#' @title PinMedia
#'
#' @description PinMedia Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMedia <- R6::R6Class(
  "PinMedia",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("PinMediaWithImage", "PinMediaWithImageAndVideo", "PinMediaWithImages", "PinMediaWithVideo", "PinMediaWithVideos"),

    #' @description
    #' Initialize a new PinMedia.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "PinMediaWithImage", "PinMediaWithImageAndVideo", "PinMediaWithImages", "PinMediaWithVideo", "PinMediaWithVideos"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaWithImage") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaWithImage"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaWithImageAndVideo") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaWithImageAndVideo"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaWithImages") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaWithImages"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaWithVideo") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaWithVideo"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "PinMediaWithVideos") {
        self$actual_instance <- instance
        self$actual_type <- "PinMediaWithVideos"
      } else {
        stop(paste("Failed to initialize PinMedia with oneOf schemas PinMediaWithImage, PinMediaWithImageAndVideo, PinMediaWithImages, PinMediaWithVideo, PinMediaWithVideos. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMedia.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of PinMedia.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMedia.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of PinMedia.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `PinMediaWithImage_result` <- tryCatch({
          `PinMediaWithImage`$public_methods$validateJSON(input)
          `PinMediaWithImage_instance` <- `PinMediaWithImage`$new()
          instance <- `PinMediaWithImage_instance`$fromJSON(input)
          instance_type <- "PinMediaWithImage"
          matched_schemas <- append(matched_schemas, "PinMediaWithImage")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaWithImage_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaWithImage_result`["message"])
      }

      `PinMediaWithVideo_result` <- tryCatch({
          `PinMediaWithVideo`$public_methods$validateJSON(input)
          `PinMediaWithVideo_instance` <- `PinMediaWithVideo`$new()
          instance <- `PinMediaWithVideo_instance`$fromJSON(input)
          instance_type <- "PinMediaWithVideo"
          matched_schemas <- append(matched_schemas, "PinMediaWithVideo")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaWithVideo_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaWithVideo_result`["message"])
      }

      `PinMediaWithImages_result` <- tryCatch({
          `PinMediaWithImages`$public_methods$validateJSON(input)
          `PinMediaWithImages_instance` <- `PinMediaWithImages`$new()
          instance <- `PinMediaWithImages_instance`$fromJSON(input)
          instance_type <- "PinMediaWithImages"
          matched_schemas <- append(matched_schemas, "PinMediaWithImages")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaWithImages_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaWithImages_result`["message"])
      }

      `PinMediaWithVideos_result` <- tryCatch({
          `PinMediaWithVideos`$public_methods$validateJSON(input)
          `PinMediaWithVideos_instance` <- `PinMediaWithVideos`$new()
          instance <- `PinMediaWithVideos_instance`$fromJSON(input)
          instance_type <- "PinMediaWithVideos"
          matched_schemas <- append(matched_schemas, "PinMediaWithVideos")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaWithVideos_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaWithVideos_result`["message"])
      }

      `PinMediaWithImageAndVideo_result` <- tryCatch({
          `PinMediaWithImageAndVideo`$public_methods$validateJSON(input)
          `PinMediaWithImageAndVideo_instance` <- `PinMediaWithImageAndVideo`$new()
          instance <- `PinMediaWithImageAndVideo_instance`$fromJSON(input)
          instance_type <- "PinMediaWithImageAndVideo"
          matched_schemas <- append(matched_schemas, "PinMediaWithImageAndVideo")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`PinMediaWithImageAndVideo_result`["error"])) {
        error_messages <- append(error_messages, `PinMediaWithImageAndVideo_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into PinMedia with oneOf schemas PinMediaWithImage, PinMediaWithImageAndVideo, PinMediaWithImages, PinMediaWithVideo, PinMediaWithVideos. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into PinMedia with oneOf schemas PinMediaWithImage, PinMediaWithImageAndVideo, PinMediaWithImages, PinMediaWithVideo, PinMediaWithVideos. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize PinMedia to JSON string.
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return JSON string representation of the PinMedia.
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      if (!is.null(self$actual_instance)) {
        json <- jsonlite::toJSON(simple, auto_unbox = TRUE, ...)
        return(as.character(jsonlite::minify(json)))
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert PinMedia to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      if (!is.null(self$actual_instance)) {
        return(self$actual_instance$toSimpleType())
      } else {
        return(NULL)
      }
    },

    #' @description
    #' Validate the input JSON with respect to PinMedia and
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
#PinMedia$unlock()
#
## Below is an example to define the print function
#PinMedia$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#PinMedia$lock()

