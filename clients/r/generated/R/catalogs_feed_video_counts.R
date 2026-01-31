#' Create a new CatalogsFeedVideoCounts
#'
#' @description
#' Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
#'
#' @docType class
#' @title CatalogsFeedVideoCounts
#' @description CatalogsFeedVideoCounts Class
#' @format An \code{R6Class} generator object
#' @field ingested_videos The number of videos successfully ingested from the feed file. integer [optional]
#' @field not_ingested_videos The number of videos that were not ingested from the feed file. integer [optional]
#' @field total_videos The number of videos in the feed file. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedVideoCounts <- R6::R6Class(
  "CatalogsFeedVideoCounts",
  public = list(
    `ingested_videos` = NULL,
    `not_ingested_videos` = NULL,
    `total_videos` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedVideoCounts class.
    #'
    #' @param ingested_videos The number of videos successfully ingested from the feed file.
    #' @param not_ingested_videos The number of videos that were not ingested from the feed file.
    #' @param total_videos The number of videos in the feed file.
    #' @param ... Other optional arguments.
    initialize = function(`ingested_videos` = NULL, `not_ingested_videos` = NULL, `total_videos` = NULL, ...) {
      if (!is.null(`ingested_videos`)) {
        if (!(is.numeric(`ingested_videos`) && length(`ingested_videos`) == 1)) {
          stop(paste("Error! Invalid data for `ingested_videos`. Must be an integer:", `ingested_videos`))
        }
        self$`ingested_videos` <- `ingested_videos`
      }
      if (!is.null(`not_ingested_videos`)) {
        if (!(is.numeric(`not_ingested_videos`) && length(`not_ingested_videos`) == 1)) {
          stop(paste("Error! Invalid data for `not_ingested_videos`. Must be an integer:", `not_ingested_videos`))
        }
        self$`not_ingested_videos` <- `not_ingested_videos`
      }
      if (!is.null(`total_videos`)) {
        if (!(is.numeric(`total_videos`) && length(`total_videos`) == 1)) {
          stop(paste("Error! Invalid data for `total_videos`. Must be an integer:", `total_videos`))
        }
        self$`total_videos` <- `total_videos`
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
    #' @return CatalogsFeedVideoCounts as a base R list.
    #' @examples
    #' # convert array of CatalogsFeedVideoCounts (x) to a data frame
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
    #' Convert CatalogsFeedVideoCounts to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsFeedVideoCountsObject <- list()
      if (!is.null(self$`ingested_videos`)) {
        CatalogsFeedVideoCountsObject[["ingested_videos"]] <-
          self$`ingested_videos`
      }
      if (!is.null(self$`not_ingested_videos`)) {
        CatalogsFeedVideoCountsObject[["not_ingested_videos"]] <-
          self$`not_ingested_videos`
      }
      if (!is.null(self$`total_videos`)) {
        CatalogsFeedVideoCountsObject[["total_videos"]] <-
          self$`total_videos`
      }
      return(CatalogsFeedVideoCountsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedVideoCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedVideoCounts
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ingested_videos`)) {
        self$`ingested_videos` <- this_object$`ingested_videos`
      }
      if (!is.null(this_object$`not_ingested_videos`)) {
        self$`not_ingested_videos` <- this_object$`not_ingested_videos`
      }
      if (!is.null(this_object$`total_videos`)) {
        self$`total_videos` <- this_object$`total_videos`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsFeedVideoCounts in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedVideoCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedVideoCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ingested_videos` <- this_object$`ingested_videos`
      self$`not_ingested_videos` <- this_object$`not_ingested_videos`
      self$`total_videos` <- this_object$`total_videos`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedVideoCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedVideoCounts
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
# CatalogsFeedVideoCounts$unlock()
#
## Below is an example to define the print function
# CatalogsFeedVideoCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedVideoCounts$lock()

