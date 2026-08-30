//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_ai_content_disclosure_label.g.dart';

class CatalogsAiContentDisclosureLabel extends EnumClass {

  /// Disclosure label for AI-generated or AI-modified content in a catalog item asset.
  @BuiltValueEnumConst(wireName: r'ai_modified')
  static const CatalogsAiContentDisclosureLabel aiModified = _$aiModified;
  /// Disclosure label for AI-generated or AI-modified content in a catalog item asset.
  @BuiltValueEnumConst(wireName: r'synthetic_performer')
  static const CatalogsAiContentDisclosureLabel syntheticPerformer = _$syntheticPerformer;

  static Serializer<CatalogsAiContentDisclosureLabel> get serializer => _$catalogsAiContentDisclosureLabelSerializer;

  const CatalogsAiContentDisclosureLabel._(String name): super(name);

  static BuiltSet<CatalogsAiContentDisclosureLabel> get values => _$values;
  static CatalogsAiContentDisclosureLabel valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CatalogsAiContentDisclosureLabelMixin = Object with _$CatalogsAiContentDisclosureLabelMixin;

