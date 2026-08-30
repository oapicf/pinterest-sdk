(ns pinterest-rest-api.specs.top-video-pins-sort-by
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def top-video-pins-sort-by-data
  {
   })

(def top-video-pins-sort-by-spec
  (ds/spec
    {:name ::top-video-pins-sort-by
     :spec top-video-pins-sort-by-data}))
