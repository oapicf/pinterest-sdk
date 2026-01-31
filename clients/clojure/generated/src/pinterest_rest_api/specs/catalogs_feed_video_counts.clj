(ns pinterest-rest-api.specs.catalogs-feed-video-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-video-counts-data
  {
   (ds/opt :ingested_videos) int?
   (ds/opt :not_ingested_videos) int?
   (ds/opt :total_videos) int?
   })

(def catalogs-feed-video-counts-spec
  (ds/spec
    {:name ::catalogs-feed-video-counts
     :spec catalogs-feed-video-counts-data}))
