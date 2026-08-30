(ns pinterest-rest-api.specs.related-terms-related-terms-list-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def related-terms-related-terms-list-items-data
  {
   (ds/opt :related_terms) (s/coll-of string?)
   (ds/opt :term) string?
   })

(def related-terms-related-terms-list-items-spec
  (ds/spec
    {:name ::related-terms-related-terms-list-items
     :spec related-terms-related-terms-list-items-data}))
