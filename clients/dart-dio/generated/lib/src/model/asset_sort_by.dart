//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_sort_by.g.dart';

class AssetSortBy extends EnumClass {

  /// The field to sort member assets by
  @BuiltValueEnumConst(wireName: r'NAME')
  static const AssetSortBy NAME = _$NAME;
  /// The field to sort member assets by
  @BuiltValueEnumConst(wireName: r'ID')
  static const AssetSortBy ID = _$ID;
  /// The field to sort member assets by
  @BuiltValueEnumConst(wireName: r'PERMISSIONS')
  static const AssetSortBy PERMISSIONS = _$PERMISSIONS;

  static Serializer<AssetSortBy> get serializer => _$assetSortBySerializer;

  const AssetSortBy._(String name): super(name);

  static BuiltSet<AssetSortBy> get values => _$values;
  static AssetSortBy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AssetSortByMixin = Object with _$AssetSortByMixin;

