#' Create a new CatalogsHotelAttributesAllOfMainImage
#'
#' @description
#' The main hotel image
#'
#' @docType class
#' @title CatalogsHotelAttributesAllOfMainImage
#' @description CatalogsHotelAttributesAllOfMainImage Class
#' @format An \code{R6Class} generator object
#' @field link <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p> character [optional]
#' @field tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelAttributesAllOfMainImage <- R6::R6Class(
  "CatalogsHotelAttributesAllOfMainImage",
  public = list(
    `link` = NULL,
    `tag` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelAttributesAllOfMainImage class.
    #'
    #' @param link <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
    #' @param tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
    #' @param ... Other optional arguments.
    initialize = function(`link` = NULL, `tag` = NULL, ...) {
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`tag`)) {
        stopifnot(is.vector(`tag`), length(`tag`) != 0)
        sapply(`tag`, function(x) stopifnot(is.character(x)))
        self$`tag` <- `tag`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelAttributesAllOfMainImage in JSON format
    toJSON = function() {
      CatalogsHotelAttributesAllOfMainImageObject <- list()
      if (!is.null(self$`link`)) {
        CatalogsHotelAttributesAllOfMainImageObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`tag`)) {
        CatalogsHotelAttributesAllOfMainImageObject[["tag"]] <-
          self$`tag`
      }
      CatalogsHotelAttributesAllOfMainImageObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelAttributesAllOfMainImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelAttributesAllOfMainImage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`tag`)) {
        self$`tag` <- ApiClient$new()$deserializeObj(this_object$`tag`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsHotelAttributesAllOfMainImage in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`link`)) {
          sprintf(
          '"link":
            "%s"
                    ',
          self$`link`
          )
        },
        if (!is.null(self$`tag`)) {
          sprintf(
          '"tag":
             [%s]
          ',
          paste(unlist(lapply(self$`tag`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelAttributesAllOfMainImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelAttributesAllOfMainImage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`link` <- this_object$`link`
      self$`tag` <- ApiClient$new()$deserializeObj(this_object$`tag`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelAttributesAllOfMainImage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelAttributesAllOfMainImage
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# CatalogsHotelAttributesAllOfMainImage$unlock()
#
## Below is an example to define the print function
# CatalogsHotelAttributesAllOfMainImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelAttributesAllOfMainImage$lock()

