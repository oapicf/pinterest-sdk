(ns pinterest-rest-api.specs.catalogs-ai-content-disclosure
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-ai-content-disclosure-label :refer :all]
            )
  (:import (java.io File)))


(def catalogs-ai-content-disclosure-data
  {
   (ds/req :disclosure) (s/coll-of catalogs-ai-content-disclosure-label-spec)
   (ds/req :url) string?
   })

(def catalogs-ai-content-disclosure-spec
  (ds/spec
    {:name ::catalogs-ai-content-disclosure
     :spec catalogs-ai-content-disclosure-data}))
