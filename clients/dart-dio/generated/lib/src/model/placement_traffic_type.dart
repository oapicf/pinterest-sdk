//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'placement_traffic_type.g.dart';

class PlacementTrafficType extends EnumClass {

  /// A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
  @BuiltValueEnumConst(wireName: r'ALL')
  static const PlacementTrafficType ALL = _$ALL;
  /// A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
  @BuiltValueEnumConst(wireName: r'TWO_COLUMN_FEED')
  static const PlacementTrafficType TWO_COLUMN_FEED = _$TWO_COLUMN_FEED;
  /// A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
  @BuiltValueEnumConst(wireName: r'FULLSCREEN_FEED')
  static const PlacementTrafficType FULLSCREEN_FEED = _$FULLSCREEN_FEED;

  static Serializer<PlacementTrafficType> get serializer => _$placementTrafficTypeSerializer;

  const PlacementTrafficType._(String name): super(name);

  static BuiltSet<PlacementTrafficType> get values => _$values;
  static PlacementTrafficType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PlacementTrafficTypeMixin = Object with _$PlacementTrafficTypeMixin;

