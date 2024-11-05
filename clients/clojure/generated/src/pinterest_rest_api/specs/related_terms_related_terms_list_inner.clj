(ns pinterest-rest-api.specs.related-terms-related-terms-list-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def related-terms-related-terms-list-inner-data
  {
   (ds/opt :term) string?
   (ds/opt :related_terms) (s/coll-of string?)
   })

(def related-terms-related-terms-list-inner-spec
  (ds/spec
    {:name ::related-terms-related-terms-list-inner
     :spec related-terms-related-terms-list-inner-data}))
