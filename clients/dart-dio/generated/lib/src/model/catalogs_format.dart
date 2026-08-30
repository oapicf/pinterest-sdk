//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_format.g.dart';

class CatalogsFormat extends EnumClass {

  /// The file format of a feed.
  @BuiltValueEnumConst(wireName: r'TSV')
  static const CatalogsFormat TSV = _$TSV;
  /// The file format of a feed.
  @BuiltValueEnumConst(wireName: r'CSV')
  static const CatalogsFormat CSV = _$CSV;
  /// The file format of a feed.
  @BuiltValueEnumConst(wireName: r'XML')
  static const CatalogsFormat XML = _$XML;
  /// The file format of a feed.
  @BuiltValueEnumConst(wireName: r'INTEGRATION')
  static const CatalogsFormat INTEGRATION = _$INTEGRATION;

  static Serializer<CatalogsFormat> get serializer => _$catalogsFormatSerializer;

  const CatalogsFormat._(String name): super(name);

  static BuiltSet<CatalogsFormat> get values => _$values;
  static CatalogsFormat valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CatalogsFormatMixin = Object with _$CatalogsFormatMixin;

