#' Create a new AdPreviewSourceImage
#'
#' @description
#' Ad preview source from an image URL.
#'
#' @docType class
#' @title AdPreviewSourceImage
#' @description AdPreviewSourceImage Class
#' @format An \code{R6Class} generator object
#' @field image_url Image URL. character
#' @field promotion_id Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. character [optional]
#' @field title Title displayed below ad. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdPreviewSourceImage <- R6::R6Class(
  "AdPreviewSourceImage",
  public = list(
    `image_url` = NULL,
    `promotion_id` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new AdPreviewSourceImage class.
    #'
    #' @param image_url Image URL.
    #' @param title Title displayed below ad.
    #' @param promotion_id Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
    #' @param ... Other optional arguments.
    initialize = function(`image_url`, `title`, `promotion_id` = NULL, ...) {
      if (!missing(`image_url`)) {
        if (!(is.character(`image_url`) && length(`image_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_url`. Must be a string:", `image_url`))
        }
        self$`image_url` <- `image_url`
      }
      if (!missing(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`promotion_id`)) {
        if (!(is.character(`promotion_id`) && length(`promotion_id`) == 1)) {
          stop(paste("Error! Invalid data for `promotion_id`. Must be a string:", `promotion_id`))
        }
        self$`promotion_id` <- `promotion_id`
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
    #' @return AdPreviewSourceImage as a base R list.
    #' @examples
    #' # convert array of AdPreviewSourceImage (x) to a data frame
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
    #' Convert AdPreviewSourceImage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdPreviewSourceImageObject <- list()
      if (!is.null(self$`image_url`)) {
        AdPreviewSourceImageObject[["image_url"]] <-
          self$`image_url`
      }
      if (!is.null(self$`promotion_id`)) {
        AdPreviewSourceImageObject[["promotion_id"]] <-
          self$`promotion_id`
      }
      if (!is.null(self$`title`)) {
        AdPreviewSourceImageObject[["title"]] <-
          self$`title`
      }
      return(AdPreviewSourceImageObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPreviewSourceImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewSourceImage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`image_url`)) {
        self$`image_url` <- this_object$`image_url`
      }
      if (!is.null(this_object$`promotion_id`)) {
        self$`promotion_id` <- this_object$`promotion_id`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdPreviewSourceImage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdPreviewSourceImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdPreviewSourceImage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`image_url` <- this_object$`image_url`
      self$`promotion_id` <- this_object$`promotion_id`
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdPreviewSourceImage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `image_url`
      if (!is.null(input_json$`image_url`)) {
        if (!(is.character(input_json$`image_url`) && length(input_json$`image_url`) == 1)) {
          stop(paste("Error! Invalid data for `image_url`. Must be a string:", input_json$`image_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewSourceImage: the required field `image_url` is missing."))
      }
      # check the required field `title`
      if (!is.null(input_json$`title`)) {
        if (!(is.character(input_json$`title`) && length(input_json$`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", input_json$`title`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdPreviewSourceImage: the required field `title` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdPreviewSourceImage
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
        return(FALSE)
      }

      if (!str_detect(self$`promotion_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `title` is null
      if (is.null(self$`title`)) {
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
      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
        invalid_fields["image_url"] <- "Non-nullable required field `image_url` cannot be null."
      }

      if (!str_detect(self$`promotion_id`, "^\\d+$")) {
        invalid_fields["promotion_id"] <- "Invalid value for `promotion_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `title` is null
      if (is.null(self$`title`)) {
        invalid_fields["title"] <- "Non-nullable required field `title` cannot be null."
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
# AdPreviewSourceImage$unlock()
#
## Below is an example to define the print function
# AdPreviewSourceImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdPreviewSourceImage$lock()

