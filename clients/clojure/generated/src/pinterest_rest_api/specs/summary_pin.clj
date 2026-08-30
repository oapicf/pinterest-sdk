(ns pinterest-rest-api.specs.summary-pin
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pin-media :refer :all]
            )
  (:import (java.io File)))


(def summary-pin-data
  {
   (ds/opt :alt_text) string?
   (ds/opt :description) string?
   (ds/req :id) string?
   (ds/opt :link) string?
   (ds/opt :media) pin-media-spec
   (ds/opt :title) string?
   })

(def summary-pin-spec
  (ds/spec
    {:name ::summary-pin
     :spec summary-pin-data}))
