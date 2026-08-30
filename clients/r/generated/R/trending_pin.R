#' Create a new TrendingPin
#'
#' @description
#' Pin image data for trending topics
#'
#' @docType class
#' @title TrendingPin
#' @description TrendingPin Class
#' @format An \code{R6Class} generator object
#' @field color Dominant color of the pin image in hex format character
#' @field height Height of the pin image in pixels integer
#' @field id Unique identifier for the pin character
#' @field src URL of the pin image character
#' @field vertical_offset The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. numeric [optional]
#' @field width Width of the pin image in pixels integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TrendingPin <- R6::R6Class(
  "TrendingPin",
  public = list(
    `color` = NULL,
    `height` = NULL,
    `id` = NULL,
    `src` = NULL,
    `vertical_offset` = NULL,
    `width` = NULL,

    #' @description
    #' Initialize a new TrendingPin class.
    #'
    #' @param color Dominant color of the pin image in hex format
    #' @param height Height of the pin image in pixels
    #' @param id Unique identifier for the pin
    #' @param src URL of the pin image
    #' @param width Width of the pin image in pixels
    #' @param vertical_offset The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
    #' @param ... Other optional arguments.
    initialize = function(`color`, `height`, `id`, `src`, `width`, `vertical_offset` = NULL, ...) {
      if (!missing(`color`)) {
        if (!(is.character(`color`) && length(`color`) == 1)) {
          stop(paste("Error! Invalid data for `color`. Must be a string:", `color`))
        }
        self$`color` <- `color`
      }
      if (!missing(`height`)) {
        if (!(is.numeric(`height`) && length(`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", `height`))
        }
        self$`height` <- `height`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`src`)) {
        if (!(is.character(`src`) && length(`src`) == 1)) {
          stop(paste("Error! Invalid data for `src`. Must be a string:", `src`))
        }
        self$`src` <- `src`
      }
      if (!missing(`width`)) {
        if (!(is.numeric(`width`) && length(`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", `width`))
        }
        self$`width` <- `width`
      }
      if (!is.null(`vertical_offset`)) {
        if (!(is.numeric(`vertical_offset`) && length(`vertical_offset`) == 1)) {
          stop(paste("Error! Invalid data for `vertical_offset`. Must be a number:", `vertical_offset`))
        }
        self$`vertical_offset` <- `vertical_offset`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return TrendingPin as a base R list.
    #' @examples
    #' # convert array of TrendingPin (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert TrendingPin to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TrendingPinObject <- list()
      if (!is.null(self$`color`)) {
        TrendingPinObject[["color"]] <-
          self$`color`
      }
      if (!is.null(self$`height`)) {
        TrendingPinObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`id`)) {
        TrendingPinObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`src`)) {
        TrendingPinObject[["src"]] <-
          self$`src`
      }
      if (!is.null(self$`vertical_offset`)) {
        TrendingPinObject[["vertical_offset"]] <-
          self$`vertical_offset`
      }
      if (!is.null(self$`width`)) {
        TrendingPinObject[["width"]] <-
          self$`width`
      }
      return(TrendingPinObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingPin
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`color`)) {
        self$`color` <- this_object$`color`
      }
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`src`)) {
        self$`src` <- this_object$`src`
      }
      if (!is.null(this_object$`vertical_offset`)) {
        self$`vertical_offset` <- this_object$`vertical_offset`
      }
      if (!is.null(this_object$`width`)) {
        self$`width` <- this_object$`width`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TrendingPin in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TrendingPin
    #'
    #' @param input_json the JSON input
    #' @return the instance of TrendingPin
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`color` <- this_object$`color`
      self$`height` <- this_object$`height`
      self$`id` <- this_object$`id`
      self$`src` <- this_object$`src`
      self$`vertical_offset` <- this_object$`vertical_offset`
      self$`width` <- this_object$`width`
      self
    },

    #' @description
    #' Validate JSON input with respect to TrendingPin and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `color`
      if (!is.null(input_json$`color`)) {
        if (!(is.character(input_json$`color`) && length(input_json$`color`) == 1)) {
          stop(paste("Error! Invalid data for `color`. Must be a string:", input_json$`color`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingPin: the required field `color` is missing."))
      }
      # check the required field `height`
      if (!is.null(input_json$`height`)) {
        if (!(is.numeric(input_json$`height`) && length(input_json$`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", input_json$`height`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingPin: the required field `height` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingPin: the required field `id` is missing."))
      }
      # check the required field `src`
      if (!is.null(input_json$`src`)) {
        if (!(is.character(input_json$`src`) && length(input_json$`src`) == 1)) {
          stop(paste("Error! Invalid data for `src`. Must be a string:", input_json$`src`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingPin: the required field `src` is missing."))
      }
      # check the required field `width`
      if (!is.null(input_json$`width`)) {
        if (!(is.numeric(input_json$`width`) && length(input_json$`width`) == 1)) {
          stop(paste("Error! Invalid data for `width`. Must be an integer:", input_json$`width`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TrendingPin: the required field `width` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TrendingPin
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `color` is null
      if (is.null(self$`color`)) {
        return(FALSE)
      }

      # check if the required `height` is null
      if (is.null(self$`height`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `src` is null
      if (is.null(self$`src`)) {
        return(FALSE)
      }

      # check if the required `width` is null
      if (is.null(self$`width`)) {
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
      # check if the required `color` is null
      if (is.null(self$`color`)) {
        invalid_fields["color"] <- "Non-nullable required field `color` cannot be null."
      }

      # check if the required `height` is null
      if (is.null(self$`height`)) {
        invalid_fields["height"] <- "Non-nullable required field `height` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `src` is null
      if (is.null(self$`src`)) {
        invalid_fields["src"] <- "Non-nullable required field `src` cannot be null."
      }

      # check if the required `width` is null
      if (is.null(self$`width`)) {
        invalid_fields["width"] <- "Non-nullable required field `width` cannot be null."
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
# TrendingPin$unlock()
#
## Below is an example to define the print function
# TrendingPin$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TrendingPin$lock()

